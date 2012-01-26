package net.reflectiv.paypal.enums;

public enum PaymentType {
	GOODS,         // This is a payment for non-digital goods
	SERVICE,       // This is a payment for services (default)
	PERSONAL,      // This is a person-to-person payment
	CASHADVANCE,   // This is a person-to-person payment for a cash advance
	DIGITALGOODS;  // This is a payment for digital goods
}