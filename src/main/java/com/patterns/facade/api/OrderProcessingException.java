package com.patterns.facade.api;

public class OrderProcessingException extends Exception {

    public static String ERR_NOT_AUTHORISED = "User is not authorise";
    public static String ERR_PAYMENT_REJECTED = "Payment was rejecte";
    public static String ERR_VERIFICATION_ERROR = "Verification error";
    public static String ERR_SUBMITTING_ERROR = "Cannot submit order";

    public OrderProcessingException(String message) {
        super(message);
    }
}
