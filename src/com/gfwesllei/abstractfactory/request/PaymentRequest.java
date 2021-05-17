package com.gfwesllei.abstractfactory.request;


public class PaymentRequest {

    private double value;
    private String cardNumber;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public PaymentRequest(double value, String cardNumber) {
        this.value = value;
        this.cardNumber = cardNumber;
    }
}
