package net.reflectiv.paypal.enums;

public enum PendingReason {
	ADDRESS_CONFIRMATION,  // The payment is pending because the sender does not have a confirmed address on file and receiver's Payment Receiving Preferences is set for manually accepting payments or denying each of these payments.
	ECHECK,                // The payment is pending because it was made by an eCheck that has not yet cleared.
	INTERNATIONAL,         // The payment is pending because the receiver holds a non-U.S. account and does not have a withdrawal mechanism. The receiver must manually accept or deny this payment from the Account Overview.
	MULTI_CURRENCY,        // The receiver does not have a balance in the currency sent, and does not have the Payment Receiving Preferences set to automatically convert and accept this payment. Receiver must manually accept or deny this payment from the Account Overview.
	UNILATERAL,            // The payment is pending because it was made to an email address that is not yet registered or confirmed.
	UPGRADE,               // The payment is pending because it was made via credit card and the receiver must upgrade the account to a Business account or Premier status to receive the funds. It can also mean that receiver has reached the monthly limit for transactions on the account.
	VERIFY,                // The payment is pending because the receiver is not yet verified.
	RISK,                  // The payment is pending while it is being reviewed by PayPal for risk.
	OTHER;                 // The payment is pending for a reason other than those listed above. For more information, contact PayPal Customer Service.
}