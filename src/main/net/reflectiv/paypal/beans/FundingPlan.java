package net.reflectiv.paypal.beans;


public class FundingPlan {
	private String fundingPlanId;
	private CurrencyType fundingAmount;
	private FundingSource backupFundingSource;
	private CurrencyType senderFees;
	private CurrencyConversion currencyConversion;
	private FundingPlanCharge charge;
	
	/**
	 * @return the fundingPlanId
	 */
	public String getFundingPlanId() {
		return fundingPlanId;
	}
	
	/**
	 * @param fundingPlanId the fundingPlanId to set
	 */
	public void setFundingPlanId(String fundingPlanId) {
		this.fundingPlanId = fundingPlanId;
	}
	
	/**
	 * @return the fundingAmount
	 */
	public CurrencyType getFundingAmount() {
		return fundingAmount;
	}
	
	/**
	 * @param fundingAmount the fundingAmount to set
	 */
	public void setFundingAmount(CurrencyType fundingAmount) {
		this.fundingAmount = fundingAmount;
	}
	
	/**
	 * @return the backupFundingSource
	 */
	public FundingSource getBackupFundingSource() {
		return backupFundingSource;
	}
	
	/**
	 * @param backupFundingSource the backupFundingSource to set
	 */
	public void setBackupFundingSource(FundingSource backupFundingSource) {
		this.backupFundingSource = backupFundingSource;
	}
	
	/**
	 * @return the senderFees
	 */
	public CurrencyType getSenderFees() {
		return senderFees;
	}
	
	/**
	 * @param senderFees the senderFees to set
	 */
	public void setSenderFees(CurrencyType senderFees) {
		this.senderFees = senderFees;
	}
	
	/**
	 * @return the currencyConversion
	 */
	public CurrencyConversion getCurrencyConversion() {
		return currencyConversion;
	}
	
	/**
	 * @param currencyConversion the currencyConversion to set
	 */
	public void setCurrencyConversion(CurrencyConversion currencyConversion) {
		this.currencyConversion = currencyConversion;
	}
	
	/**
	 * @return the charge
	 */
	public FundingPlanCharge getCharge() {
		return charge;
	}
	
	/**
	 * @param charge the charge to set
	 */
	public void setCharge(FundingPlanCharge charge) {
		this.charge = charge;
	}
}