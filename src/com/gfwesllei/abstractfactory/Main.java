package com.gfwesllei.abstractfactory;

import com.gfwesllei.abstractfactory.payments.MercadoPagoAdapter;
import com.gfwesllei.abstractfactory.payments.Payment;
import com.gfwesllei.abstractfactory.payments.impl.PayPalPayment;
import com.gfwesllei.abstractfactory.request.PaymentRequest;

public class Main {

    public static void main(String[] args) {

        String token="jsijsijijijs";
        double value = 10.0;
        //Payment payment = new PayPalPayment();
        Payment payment = new MercadoPagoAdapter();
        payment.doPayment(token, new PaymentRequest(value,token));

    }
}
