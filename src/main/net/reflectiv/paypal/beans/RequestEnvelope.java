package net.reflectiv.paypal.beans;

public class RequestEnvelope {
	private String detailLevel = "ReturnAll";  // Default values
	private String errorLanguage = "en_US";    // Default values
	
	/**
	 * @return the detailLevel
	 */
	public String getDetailLevel() {
		return detailLevel;
	}
	
	/**
	 * @param detailLevel the detailLevel to set
	 */
	public void setDetailLevel(String detailLevel) {
		this.detailLevel = detailLevel;
	}
	
	/**
	 * @return the errorLanguage
	 */
	public String getErrorLanguage() {
		return errorLanguage;
	}
	
	/**
	 * @param errorLanguage the errorLanguage to set
	 */
	public void setErrorLanguage(String errorLanguage) {
		this.errorLanguage = errorLanguage;
	}
}