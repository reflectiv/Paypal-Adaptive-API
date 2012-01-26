package net.reflectiv.paypal.beans;

import net.reflectiv.paypal.enums.FundingSourceType;

public class FundingSource {
	private String lastFourOfAccountNumber;
	private FundingSourceType type;
	private String displayName;
	private String fundingSourceId;
	private Boolean allowed;
	
	/**
	 * @return the lastFourOfAccountNumber
	 */
	public String getLastFourOfAccountNumber() {
		return lastFourOfAccountNumber;
	}
	
	/**
	 * @param lastFourOfAccountNumber the lastFourOfAccountNumber to set
	 */
	public void setLastFourOfAccountNumber(String lastFourOfAccountNumber) {
		this.lastFourOfAccountNumber = lastFourOfAccountNumber;
	}
	
	/**
	 * @return the type
	 */
	public FundingSourceType getType() {
		return type;
	}
	
	/**
	 * @param type the type to set
	 */
	public void setType(FundingSourceType type) {
		this.type = type;
	}
	
	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}
	
	/**
	 * @param displayName the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
	/**
	 * @return the fundingSourceId
	 */
	public String getFundingSourceId() {
		return fundingSourceId;
	}
	
	/**
	 * @param fundingSourceId the fundingSourceId to set
	 */
	public void setFundingSourceId(String fundingSourceId) {
		this.fundingSourceId = fundingSourceId;
	}
	
	/**
	 * @return the allowed
	 */
	public Boolean getAllowed() {
		return allowed;
	}
	
	/**
	 * @param allowed the allowed to set
	 */
	public void setAllowed(Boolean allowed) {
		this.allowed = allowed;
	}
}