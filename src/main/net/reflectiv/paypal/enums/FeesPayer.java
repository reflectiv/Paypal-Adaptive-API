package net.reflectiv.paypal.enums;

public enum FeesPayer {
	SENDER,           // Sender pays all fees (for personal, implicit simple/parallel payments; do not use for chained or unilateral payments)
	PRIMARYRECEIVER,  // Primary receiver pays all fees (chained payments only)
	EACHRECEIVER,     // Each receiver pays their own fee (default, personal and unilateral payments)
	SECONDARYONLY;    // Secondary receivers pay all fees (use only for chained payments with one secondary receiver)
}