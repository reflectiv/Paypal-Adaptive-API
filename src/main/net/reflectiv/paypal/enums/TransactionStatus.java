package net.reflectiv.paypal.enums;

public enum TransactionStatus {
	COMPLETED,           // The sender’s transaction has completed
	PENDING,             // The transaction is awaiting further processing
	CREATED,             // The payment request was received; funds will be transferred once approval is received
	PARTIALLY_REFUNDED,  // Transaction was partially refunded
	DENIED,              // The transaction was rejected by the receiver
	PROCESSING,          // The transaction is in progress
	REVERSED,            // The payment was returned to the sender
	REFUNDED,            // The payment was refunded
	FAILED;              // The payment failed
}
