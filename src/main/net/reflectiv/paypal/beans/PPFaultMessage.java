package net.reflectiv.paypal.beans;


import java.util.List;

public class PPFaultMessage extends Exception {
	private List<ErrorData> error;
	private ResponseEnvelope responseEnvelope;
	
	/**
	 * @return the error
	 */
	public List<ErrorData> getError() {
		return error;
	}
	
	/**
	 * @param error the error to set
	 */
	public void setError(List<ErrorData> error) {
		this.error = error;
	}
	
	/**
	 * @return the responseEnvelope
	 */
	public ResponseEnvelope getResponseEnvelope() {
		return responseEnvelope;
	}
	
	/**
	 * @param responseEnvelope the responseEnvelope to set
	 */
	public void setResponseEnvelope(ResponseEnvelope responseEnvelope) {
		this.responseEnvelope = responseEnvelope;
	}
}