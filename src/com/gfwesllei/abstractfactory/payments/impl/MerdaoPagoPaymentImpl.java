package com.gfwesllei.abstractfactory.payments.impl;

import com.gfwesllei.abstractfactory.payments.MercadoPagoPayment;

public class MerdaoPagoPaymentImpl implements MercadoPagoPayment {

    @Override
    public void doPayment(String token, String cardNumber) {
        System.out.println("doPayment at mercado pago");
    }

    @Override
    public void receivePayment() {
        System.out.println("receive payment at mercado pago");
    }
}
