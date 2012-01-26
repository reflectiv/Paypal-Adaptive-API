package net.reflectiv.paypal.ap.pay;


import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.reflectiv.paypal.AdaptiveApi;
import net.reflectiv.paypal.IAdaptiveRequest;
import net.reflectiv.paypal.IAdaptiveResponse;
import net.reflectiv.paypal.beans.ClientDetails;
import net.reflectiv.paypal.beans.PPFaultMessage;
import net.reflectiv.paypal.beans.Receiver;
import net.reflectiv.paypal.beans.RequestEnvelope;
import net.reflectiv.paypal.beans.SenderIdentifier;
import net.reflectiv.paypal.enums.ActionType;
import net.reflectiv.paypal.enums.FeesPayer;
import net.reflectiv.paypal.enums.FundingType;

public class PayRequest implements IAdaptiveRequest {
	private ActionType actionType;
	private String cancelUrl;
	private ClientDetails clientDetails;
	private String currencyCode;
	private FeesPayer feesPayer;
	private List<FundingType> fundingConstraint; // not sure about it
	private String ipnNotificationUrl;
	private String memo;
	private String pin;
	private String preapprovalKey;
	private HashMap<String, List<Receiver>> receiverList;
	private RequestEnvelope requestEnvelope;
	private String returnUrl;
	private Boolean reverseAllParallelPaymentsOnError;
	private String senderEmail;
	private SenderIdentifier sender;
	private String trackingId;

	public PayRequest(ActionType actionType, String currencyCode, String returnUrl, String cancelUrl) {
		receiverList = new HashMap<String, List<Receiver>>(1);
		receiverList.put("receiver", new ArrayList<Receiver>());

		requestEnvelope = new RequestEnvelope();

		this.actionType = actionType;
		this.currencyCode = currencyCode;
		this.returnUrl = returnUrl;
		this.cancelUrl = cancelUrl;
	}
	
	@Override
	public PayResponse send() throws ProtocolException, IOException, PPFaultMessage {
		return AdaptiveApi.INSTANCE.send("AdaptivePayments/Pay", this, PayResponse.class);
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
	 * @return the clientDetails
	 */
	public ClientDetails getClientDetails() {
		return clientDetails;
	}

	/**
	 * @param clientDetails the clientDetails to set
	 */
	public void setClientDetails(ClientDetails clientDetails) {
		this.clientDetails = clientDetails;
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
	 * @return the fundingConstraint
	 */
	public List<FundingType> getFundingConstraint() {
		return fundingConstraint;
	}

	/**
	 * @param fundingConstraint the fundingConstraint to set
	 */
	public void setFundingConstraint(List<FundingType> fundingConstraint) {
		this.fundingConstraint = fundingConstraint;
	}

	public void addFundingConstraint(FundingType fundingType) {
		if (this.fundingConstraint == null) {
			this.fundingConstraint = new ArrayList<FundingType>();
		}

		this.fundingConstraint.add(fundingType);
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
	 * @return the pin
	 */
	public String getPin() {
		return pin;
	}

	/**
	 * @param pin the pin to set
	 */
	public void setPin(String pin) {
		this.pin = pin;
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
	 * @return the receiverList
	 */
	public List<Receiver> getReceiverList() {
		return receiverList.get("receiver");
	}

	/**
	 * @param receiverList the receiverList to set
	 */
	public void setReceiverList(List<Receiver> receiverList) {
		this.receiverList.put("receiver", receiverList);
	}

	public void addReceiver(Receiver receiver) {

		this.receiverList.get("receiver").add(receiver);
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
	public void setReverseAllParallelPaymentsOnError(Boolean reverseAllParallelPaymentsOnError) {
		this.reverseAllParallelPaymentsOnError = reverseAllParallelPaymentsOnError;
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