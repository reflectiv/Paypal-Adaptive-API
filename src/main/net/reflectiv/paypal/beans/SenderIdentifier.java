package net.reflectiv.paypal.beans;

public class SenderIdentifier {
	private String email;
	private Boolean useCredentials;

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
	 * @return the useCredentials
	 */
	public Boolean getUseCredentials() {
		return useCredentials;
	}

	/**
	 * @param useCredentials the useCredentials to set
	 */
	public void setUseCredentials(Boolean useCredentials) {
		this.useCredentials = useCredentials;
	}
}
