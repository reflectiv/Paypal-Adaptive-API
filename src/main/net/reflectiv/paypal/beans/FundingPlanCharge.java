package net.reflectiv.paypal.beans;


public class FundingPlanCharge {
	private CurrencyType charge;
	private FundingSource fundingSource;
	
	/**
	 * @return the charge
	 */
	public CurrencyType getCharge() {
		return charge;
	}
	
	/**
	 * @param charge the charge to set
	 */
	public void setCharge(CurrencyType charge) {
		this.charge = charge;
	}
	
	/**
	 * @return the fundingSource
	 */
	public FundingSource getFundingSource() {
		return fundingSource;
	}
	
	/**
	 * @param fundingSource the fundingSource to set
	 */
	public void setFundingSource(FundingSource fundingSource) {
		this.fundingSource = fundingSource;
	}
}