package com.gfwesllei.abstractfactory.payments;

public interface MercadoPagoPayment {

    void doPayment(String token,String cardNumber);
    void receivePayment();
}
