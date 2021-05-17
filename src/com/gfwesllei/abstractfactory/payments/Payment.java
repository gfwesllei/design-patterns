package com.gfwesllei.abstractfactory.payments;

import com.gfwesllei.abstractfactory.request.PaymentRequest;
import com.gfwesllei.abstractfactory.response.PaymentRespose;

public interface Payment {

    void doPayment(String token, PaymentRequest request);
    void receivePayment(String token, PaymentRespose request);
}
