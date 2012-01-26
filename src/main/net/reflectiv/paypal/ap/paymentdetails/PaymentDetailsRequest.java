package net.reflectiv.paypal.ap.paymentdetails;

import java.io.IOException;
import java.net.ProtocolException;

import net.reflectiv.paypal.AdaptiveApi;
import net.reflectiv.paypal.IAdaptiveRequest;
import net.reflectiv.paypal.ap.pay.PayResponse;
import net.reflectiv.paypal.beans.PPFaultMessage;
import net.reflectiv.paypal.beans.RequestEnvelope;

public class PaymentDetailsRequest implements IAdaptiveRequest {
	private String payKey;
	private RequestEnvelope requestEnvelope;
	private String transactionId;
	private String trackingId;
	
	public PaymentDetailsRequest() {
		requestEnvelope = new RequestEnvelope();
	}
	
	@Override
	public PaymentDetailsResponse send() throws ProtocolException, IOException, PPFaultMessage {
		return AdaptiveApi.INSTANCE.send("AdaptivePayments/PaymentDetails", this, PaymentDetailsResponse.class);
	}
	
	/**
	 * @return the payKey
	 */
	public String getPayKey() {
		return payKey;
	}
	
	/**
	 * @param payKey the payKey to set
	 */
	public void setPayKey(String payKey) {
		this.payKey = payKey;
	}
	
	/**
	 * @return the requestEnvelope
	 */
	public RequestEnvelope getRequestEnvelope() {
		return requestEnvelope;
	}
	
	/**
	 * @param requestEnvelope the requestEnvelope to set
	 */
	public void setRequestEnvelope(RequestEnvelope requestEnvelope) {
		this.requestEnvelope = requestEnvelope;
	}
	
	/**
	 * @return the transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}
	
	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
	/**
	 * @return the trackingId
	 */
	public String getTrackingId() {
		return trackingId;
	}
	
	/**
	 * @param trackingId the trackingId to set
	 */
	public void setTrackingId(String trackingId) {
		this.trackingId = trackingId;
	}
}