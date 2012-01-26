package net.reflectiv.paypal.ap.paymentdetails;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.reflectiv.paypal.IAdaptiveResponse;
import net.reflectiv.paypal.beans.PaymentInfo;
import net.reflectiv.paypal.beans.Receiver;
import net.reflectiv.paypal.beans.ResponseEnvelope;
import net.reflectiv.paypal.beans.SenderIdentifier;
import net.reflectiv.paypal.enums.ActionType;
import net.reflectiv.paypal.enums.FeesPayer;
import net.reflectiv.paypal.enums.FundingType;
import net.reflectiv.paypal.enums.Status;

public class PaymentDetailsResponse implements IAdaptiveResponse {
	private ActionType actionType;
	private String cancelUrl;
	private String currencyCode;
	private FeesPayer feesPayer;
	private HashMap<String, List<FundingType>> fundingtypeList;
	private String ipnNotificationUrl;
	private String memo;
	private String payKey;
	private HashMap<String, List<PaymentInfo>> paymentInfoList;
	private String preapprovalKey;
	private ResponseEnvelope responseEnvelope;
	private String returnUrl;
	private Boolean reverseAllParallelPaymentsOnError;
	private SenderIdentifier sender;
	private String senderEmail;
	private Status status;
	private String trackingId;

	public PaymentDetailsResponse() {
		paymentInfoList = new HashMap<String, List<PaymentInfo>>(1);
		paymentInfoList.put("paymentInfo", new ArrayList<PaymentInfo>());
	}


	/**
	 * @return the actionType
	 */
	public ActionType getActionType() {
		return actionType;
	}

	/**
	 * @param actionType the actionType to set
	 */
	public void setActionType(ActionType actionType) {
		this.actionType = actionType;
	}

	/**
	 * @return the cancelUrl
	 */
	public String getCancelUrl() {
		return cancelUrl;
	}

	/**
	 * @param cancelUrl the cancelUrl to set
	 */
	public void setCancelUrl(String cancelUrl) {
		this.cancelUrl = cancelUrl;
	}

	/**
	 * @return the currencyCode
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * @param currencyCode the currencyCode to set
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * @return the feesPayer
	 */
	public FeesPayer getFeesPayer() {
		return feesPayer;
	}

	/**
	 * @param feesPayer the feesPayer to set
	 */
	public void setFeesPayer(FeesPayer feesPayer) {
		this.feesPayer = feesPayer;
	}
	
	/**
	 * @return the fundingtypeList
	 */
	public HashMap<String, List<FundingType>> getFundingtypeList() {
		return fundingtypeList;
	}

	/**
	 * @param fundingtypeList the fundingtypeList to set
	 */
	public void setFundingtypeList(HashMap<String, List<FundingType>> fundingtypeList) {
		this.fundingtypeList = fundingtypeList;
	}

	/**
	 * @return the ipnNotificationUrl
	 */
	public String getIpnNotificationUrl() {
		return ipnNotificationUrl;
	}

	/**
	 * @param ipnNotificationUrl the ipnNotificationUrl to set
	 */
	public void setIpnNotificationUrl(String ipnNotificationUrl) {
		this.ipnNotificationUrl = ipnNotificationUrl;
	}

	/**
	 * @return the memo
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * @param memo the memo to set
	 */
	public void setMemo(String memo) {
		this.memo = memo;
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
	 * @return the paymentInfo
	 */
	public HashMap<String, List<PaymentInfo>> getPaymentInfoList() {
		return paymentInfoList;
	}

	/**
	 * @param paymentInfo the paymentInfo to set
	 */
	public void setPaymentInfoList(HashMap<String, List<PaymentInfo>> paymentInfoList) {
		this.paymentInfoList = paymentInfoList;
	}

	/**
	 * @return the preapprovalKey
	 */
	public String getPreapprovalKey() {
		return preapprovalKey;
	}

	/**
	 * @param preapprovalKey the preapprovalKey to set
	 */
	public void setPreapprovalKey(String preapprovalKey) {
		this.preapprovalKey = preapprovalKey;
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

	/**
	 * @return the returnUrl
	 */
	public String getReturnUrl() {
		return returnUrl;
	}

	/**
	 * @param returnUrl the returnUrl to set
	 */
	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	/**
	 * @return the reverseAllParallelPaymentsOnError
	 */
	public Boolean getReverseAllParallelPaymentsOnError() {
		return reverseAllParallelPaymentsOnError;
	}

	/**
	 * @param reverseAllParallelPaymentsOnError the reverseAllParallelPaymentsOnError to set
	 */
	public void setReverseAllParallelPaymentsOnError(
			Boolean reverseAllParallelPaymentsOnError) {
		this.reverseAllParallelPaymentsOnError = reverseAllParallelPaymentsOnError;
	}

	/**
	 * @return the sender
	 */
	public SenderIdentifier getSender() {
		return sender;
	}

	/**
	 * @param sender the sender to set
	 */
	public void setSender(SenderIdentifier sender) {
		this.sender = sender;
	}

	/**
	 * @return the senderEmail
	 */
	public String getSenderEmail() {
		return senderEmail;
	}

	/**
	 * @param senderEmail the senderEmail to set
	 */
	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}

	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
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