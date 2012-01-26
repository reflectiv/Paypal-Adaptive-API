package net.reflectiv.paypal.enums;

public enum Status {
	CREATED,        // The payment request was received; funds will be transferred once the payment is approved
	COMPLETED,      // The payment was successful
	INCOMPLETE,     // Some transfers succeeded and some failed for a parallel payment or, for a delayed chained payment, secondary receivers have not been paid
	ERROR,          // The payment failed and all attempted transfers failed or all completed transfers were successfully reversed
	REVERSALERROR,  // One or more transfers failed when attempting to reverse a payment
	PROCESSING,     // The payment is in progress
	PENDING;        // The payment is awaiting processing
}