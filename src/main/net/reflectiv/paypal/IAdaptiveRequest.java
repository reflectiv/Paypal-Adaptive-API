package net.reflectiv.paypal;

import java.io.IOException;
import java.net.ProtocolException;

import net.reflectiv.paypal.beans.PPFaultMessage;

public interface IAdaptiveRequest {
	public <T extends IAdaptiveResponse> T send() throws ProtocolException, IOException, PPFaultMessage;
}