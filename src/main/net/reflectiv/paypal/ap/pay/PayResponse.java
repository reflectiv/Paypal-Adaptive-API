package net.reflectiv.paypal.ap.pay;


import java.util.List;

import net.reflectiv.paypal.IAdaptiveResponse;
import net.reflectiv.paypal.beans.FundingPlan;
import net.reflectiv.paypal.beans.PayError;
import net.reflectiv.paypal.beans.ResponseEnvelope;
import net.reflectiv.paypal.enums.Status;

public class PayResponse implements IAdaptiveResponse {
	private String payKey;
	private List<PayError> payErrorList;
	private Status paymentExecStatus;
	private FundingPlan defaultFundingPlan;
	private ResponseEnvelope responseEnvelope;
	
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
	 * @return the payErrorList
	 */
	public List<PayError> getPayErrorList() {
		return payErrorList;
	}
	
	/**
	 * @param payErrorList the payErrorList to set
	 */
	public void setPayErrorList(List<PayError> payErrorList) {
		this.payErrorList = payErrorList;
	}
	
	/**
	 * @return the paymentExecStatus
	 */
	public Status getPaymentExecStatus() {
		return paymentExecStatus;
	}
	
	/**
	 * @param paymentExecStatus the paymentExecStatus to set
	 */
	public void setPaymentExecStatus(Status paymentExecStatus) {
		this.paymentExecStatus = paymentExecStatus;
	}
	
	/**
	 * @return the defaultFundingPlan
	 */
	public FundingPlan getDefaultFundingPlan() {
		return defaultFundingPlan;
	}
	
	/**
	 * @param defaultFundingPlan the defaultFundingPlan to set
	 */
	public void setDefaultFundingPlan(FundingPlan defaultFundingPlan) {
		this.defaultFundingPlan = defaultFundingPlan;
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