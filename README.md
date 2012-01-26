# Introduction

Paypal Adaptive API is an implementation of the [Paypal Adaptive API](https://cms.paypal.com/us/cgi-bin/?cmd=_render-content&content_ID=developer/howto_api_overview) aimed to work directly with JSON.

I decided to not use the SDK provided by Paypal for three reasons :

 1. The archive is 23Mo long
 2. The SDK is provided with many other stuffs I feel aren't required
 3. The beans are in XML (and I wanted it in JSON) (kind of an argument, isn't it ;))

Most of all, this project is more of a try & learn with Paypal API and to code better in JAVA, so if you find awfull OO logics in this code, please! tell me!

The lib is still very young and you shouldn't use it in production mode. I try to commit only tested items, but the Paypal API is so various that I can't be sure that everything works fine (for example, the Funding parts of a PaymentDetails can't be check unless you have set a Refund, etc).

So if you find bugs, [feel free to let met know](https://github.com/Reflectiv/Paypal-Adaptive-API/issues), I will be more than happy to fix them.

# How to use it :

My main goal was this lib to be as simple as possible. So all you need to do, is first set your headers for the Paypal API (you should set them on your Application start).

Something like :

    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put("X-PAYPAL-SECURITY-USERID",    "Your Paypal User ID");
    headers.put("X-PAYPAL-SECURITY-PASSWORD",  "Your Paypal Password");
    headers.put("X-PAYPAL-SECURITY-SIGNATURE", "Your Paypal Signature");
    headers.put("X-PAYPAL-APPLICATION-ID",     "Your-Application-ID");

    AdaptiveApi.INSTANCE.setHeaders(headers);
    AdaptiveApi.INSTANCE.setProduction(false);

Now, the fun part !

## Create a payment:

    PayRequest request = new PayRequest(ActionType.PAY, "USD", "http://www.mywebsite.com/paypal/return", "http://www.mywebsite.com/paypal/cancel");
    request.addReceiver(new Receiver("email@example.com", 15d));
		
    // in case of a chained payment
    request.addReceiver(new Receiver("other@example.com", 25d, true));
		
    // just not set true to have a parallel payment.

    // And then, send the request :
    // Be careful, send() throws ProtocolException, IOException, PPFaultMessage
    PayResponse response = request.send();

    // That's easy ! :)

## Get the details of a payment:

    PaymentDetailsRequest request = new PaymentDetailsRequest();
    request.setPayKey("AP-123456789ABCDEFGHI");
    // or you can set a TrackingId or a TransactionID, or all of them, depending of your needs

    PaymentDetailsResponse response = request.send(); // BAM! Easy!

    // Check the response to see how the payment goes.

# What is PPFaultMessage thrown ?

In case the JSON you sent to the Paypal API is wrong, or a value is missing, Paypal will return a response containing a list of errors and their gravity (Error or Warning).

The send method act with a simple logic in mind : it tries to parse the result as if it were no errors (it cast it to the expected class).
If a JsonParseException occurs, we try to parse the returned JSON as a PPFaultMessage class an throw it. If not, we throw the original JsonParseException exception.
But if the parsing initially succeed, we still check for the status of the RequestEnvelope, because sometimes, GSON doesn't throw any errors but the response is a PPFaultMessage. If the "ack" of the RequestEnvelope is set to Failure or FailureWithWarning, we throw a PPFaultMessage.

# What do you use as the JSON library ?

[GSON](http://code.google.com/p/google-gson/)

# What's next ?

I'll try to update that lib to add more request to the Paypal API. If you need one that isn't present, feel free to fork the project and send me the modification, I will implement them.

If you find anything bad on that code, please report it, I won't bite ;)
