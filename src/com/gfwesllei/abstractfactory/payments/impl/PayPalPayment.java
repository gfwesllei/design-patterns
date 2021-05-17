package com.gfwesllei.abstractfactory.payments.impl;

import com.gfwesllei.abstractfactory.payments.Payment;
import com.gfwesllei.abstractfactory.request.PaymentRequest;
import com.gfwesllei.abstractfactory.response.PaymentRespose;

public class PayPalPayment implements Payment {

    @Override
    public void doPayment(String token, PaymentRequest request) {
        System.out.println("Realizando pagamento com PayPal");
    }

    @Override
    public void receivePayment(String token, PaymentRespose request) {
        System.out.println("Recebendo Pagamento com Paypal");
    }
}
