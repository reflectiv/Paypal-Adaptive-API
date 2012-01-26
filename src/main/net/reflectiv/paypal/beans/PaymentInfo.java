package net.reflectiv.paypal.beans;

import net.reflectiv.paypal.enums.PendingReason;
import net.reflectiv.paypal.enums.TransactionStatus;

public class PaymentInfo {
	private PendingReason pendingReason;
	private Boolean pendingRefund;
	private Receiver receiver;
	private Double refundedAmount;
	private String senderTransactionId;
	private TransactionStatus senderTransactionStatus;
	private String transactionId;
	private TransactionStatus transactionStatus;
	
	/**
	 * @return the pendingReason
	 */
	public PendingReason getPendingReason() {
		return pendingReason;
	}
	
	/**
	 * @param pendingReason the pendingReason to set
	 */
	public void setPendingReason(PendingReason pendingReason) {
		this.pendingReason = pendingReason;
	}
	
	/**
	 * @return the pendingRefund
	 */
	public Boolean getPendingRefund() {
		return pendingRefund;
	}
	
	/**
	 * @param pendingRefund the pendingRefund to set
	 */
	public void setPendingRefund(Boolean pendingRefund) {
		this.pendingRefund = pendingRefund;
	}
	
	/**
	 * @return the receiver
	 */
	public Receiver getReceiver() {
		return receiver;
	}
	
	/**
	 * @param receiver the receiver to set
	 */
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}
	
	/**
	 * @return the refundedAmount
	 */
	public Double getRefundedAmount() {
		return refundedAmount;
	}
	
	/**
	 * @param refundedAmount the refundedAmount to set
	 */
	public void setRefundedAmount(Double refundedAmount) {
		this.refundedAmount = refundedAmount;
	}
	
	/**
	 * @return the senderTransactionId
	 */
	public String getSenderTransactionId() {
		return senderTransactionId;
	}
	
	/**
	 * @param senderTransactionId the senderTransactionId to set
	 */
	public void setSenderTransactionId(String senderTransactionId) {
		this.senderTransactionId = senderTransactionId;
	}
	
	/**
	 * @return the senderTransactionStatus
	 */
	public TransactionStatus getSenderTransactionStatus() {
		return senderTransactionStatus;
	}
	
	/**
	 * @param senderTransactionStatus the senderTransactionStatus to set
	 */
	public void setSenderTransactionStatus(TransactionStatus senderTransactionStatus) {
		this.senderTransactionStatus = senderTransactionStatus;
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
	 * @return the transactionStatus
	 */
	public TransactionStatus getTransactionStatus() {
		return transactionStatus;
	}
	
	/**
	 * @param transactionStatus the transactionStatus to set
	 */
	public void setTransactionStatus(TransactionStatus transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
}