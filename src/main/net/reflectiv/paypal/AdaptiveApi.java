package net.reflectiv.paypal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map.Entry;

import net.reflectiv.paypal.beans.PPFaultMessage;
import net.reflectiv.paypal.enums.AckCode;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;

public enum AdaptiveApi {
	INSTANCE; // seems to be the best way to do it : http://stackoverflow.com/questions/70689/efficient-way-to-implement-singleton-pattern-in-java

	private boolean production = false;
	private HashMap<String, String> headers;

	private AdaptiveApi() {
		headers = new HashMap<String, String>();
	}

	public String getBaseUrl() {
		return String.format ("https://svcs%s.paypal.com/", ((production) ? "" : ".sandbox"));
	}

	/**
	 * Send a request to Paypal Adaptive Payment API as JSON and return a deserialized object
	 *
	 * @param url
	 * @param request
	 * @param to
	 *
	 * @return
	 *
	 * @throws ProtocolException
	 * @throws IOException
	 * @throws PPFaultMessage
	 */
	public <T extends IAdaptiveResponse> T send(String url, IAdaptiveRequest request, Class<T> to) throws ProtocolException, IOException, PPFaultMessage {
		HttpURLConnection uc = null;
		try {
			// send request to paypal
			URL u = new URL(getBaseUrl() + url);

			uc = (HttpURLConnection) u.openConnection();
			uc.setDoOutput(true);
			uc.setRequestMethod("POST");
		}
		catch (MalformedURLException e) {
			// Shall never happens because we wrote this url!
			return null;
		}

		// headers :

		// We set those two before, in case headers overwrite them
		uc.setRequestProperty("X-PAYPAL-REQUEST-DATA-FORMAT", "JSON");
		uc.setRequestProperty("X-PAYPAL-RESPONSE-DATA-FORMAT", "JSON");

		for(Entry<String, String> entry : headers.entrySet()) {
			uc.setRequestProperty(entry.getKey(), entry.getValue());
		}

		GsonBuilder gson = new GsonBuilder();
		Gson parser = gson.create();

		// send data
		PrintWriter pw = new PrintWriter(uc.getOutputStream());
		pw.println(parser.toJson(request));
		pw.close();

		// Read response
		String response = "";
		BufferedReader in = new BufferedReader(
		new InputStreamReader(uc.getInputStream()));
		response = in.readLine();
		in.close();

		if (response == null)
			return null;

		// Transform response as a Java Object
		try {
			IAdaptiveResponse detailsResponse = parser.fromJson(response, (Class) to);
			if (detailsResponse.getResponseEnvelope().getAck().equals(AckCode.Failure) || detailsResponse.getResponseEnvelope().getAck().equals(AckCode.FailureWithWarning))
				throw new JsonParseException("");

			return (T) detailsResponse;
		}
		catch(JsonParseException e) {
			if (!e.getMessage().equals("")) throw e;

			throw parser.fromJson(response, PPFaultMessage.class);
		}
	}

	public HashMap<String, String> getHeaders() {
		return headers;
	}

	public void setHeaders(HashMap<String, String> headers) {
		this.headers = headers;
	}

	public void addHeader(String name, String value) {
		headers.put(name, value);
	}

	public boolean isProduction() {
		return production;
	}

	public void setProduction(boolean production) {
		this.production = production;
	}

	/**
	 * Used when Paypal call the IPN to verify it's authenticity
	 *
	 * @param url
	 * @param body
	 *
	 * @return
	 *
	 * @throws IOException
	 */
	public boolean ipnVerify(String url, String body) throws IOException {
		StringBuilder reply = new StringBuilder();
		reply.append("cmd=_notify-validate&");
		reply.append(body);

		URL u = new URL(url);
		URLConnection uc = u.openConnection();
		uc.setDoOutput(true);
		uc.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
		PrintWriter pw = new PrintWriter(uc.getOutputStream());
		pw.println(reply);
		pw.close();

		String response = "";
		BufferedReader in = new BufferedReader(
		new InputStreamReader(uc.getInputStream()));
		response = in.readLine();
		in.close();

		if ("VERIFIED".equals(response)) {
			return true;
		}

		return false;
	}
}