package net.reflectiv.paypal.enums;

public enum AckCode {
	Success,             // The operation completed successfully.
	Failure,             // The operation failed.
	Warning,             // Warning.
	SuccessWithWarning,  // The operation completed successfully; however, there is a warning message.
	FailureWithWarning;  // The operation failed with a warning message.
}