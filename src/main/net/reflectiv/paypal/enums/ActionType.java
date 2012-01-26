package net.reflectiv.paypal.enums;

public enum ActionType {
	PAY,          // Use this option if you are not using the Pay request in combination with ExecutePayment.
	CREATE,       // Use this option to set up the payment instructions with SetPaymentOptions and then execute the payment at a later time with the ExecutePayment.
	PAY_PRIMARY;  // For chained payments only, specify this value to delay payments to the secondary receivers; only the payment to the primary receiver is processed.
}
