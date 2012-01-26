package net.reflectiv.paypal.enums;

public enum ErrorCategory {
	System,       //The system encountered errors; try again
	Application,  //The application encountered errors; try again
	Request;      //The request was incorrect
}