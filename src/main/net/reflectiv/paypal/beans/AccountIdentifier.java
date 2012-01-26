package net.reflectiv.paypal.beans;


public class AccountIdentifier {
	private String email;
	private PhoneNumberType phone;
	
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
}