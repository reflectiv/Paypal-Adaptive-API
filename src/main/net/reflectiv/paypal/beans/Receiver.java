package net.reflectiv.paypal.beans;

import net.reflectiv.paypal.enums.PaymentType;

public class Receiver {
	private Double amount;
	private String email;
	private String invoiceId;
	private PaymentType paymentType;
	private String paymentSubType;
	private PhoneNumberType phone;
	private Boolean primary;
	
	public Receiver() {}
	
	public Receiver(String email, Double amount) {
		this(email, amount, false);
	}
	
	public Receiver(String email, Double amount, Boolean primary) {
		this.email = email;
		this.amount = amount;
		this.primary = primary;
	}
	
	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}
	
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return the invoiceId
	 */
	public String getInvoiceId() {
		return invoiceId;
	}
	
	/**
	 * @param invoiceId the invoiceId to set
	 */
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	
	/**
	 * @return the paymentType
	 */
	public PaymentType getPaymentType() {
		return paymentType;
	}
	
	/**
	 * @param paymentType the paymentType to set
	 */
	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}
	
	/**
	 * @return the paymentSubType
	 */
	public String getPaymentSubType() {
		return paymentSubType;
	}
	
	/**
	 * @param paymentSubType the paymentSubType to set
	 */
	public void setPaymentSubType(String paymentSubType) {
		this.paymentSubType = paymentSubType;
	}
	
	/**
	 * @return the phone
	 */
	public PhoneNumberType getPhone() {
		return phone;
	}
	
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(PhoneNumberType phone) {
		this.phone = phone;
	}
	
	/**
	 * @return the primary
	 */
	public Boolean getPrimary() {
		return primary;
	}
	
	/**
	 * @param primary the primary to set
	 */
	public void setPrimary(Boolean primary) {
		this.primary = primary;
	}
}