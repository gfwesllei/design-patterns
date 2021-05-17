package com.gfwesllei.abstractfactory.payments;

import com.gfwesllei.abstractfactory.payments.impl.MerdaoPagoPaymentImpl;
import com.gfwesllei.abstractfactory.payments.impl.PayPalPayment;
import com.gfwesllei.abstractfactory.request.PaymentRequest;
import com.gfwesllei.abstractfactory.response.PaymentRespose;

public class MercadoPagoAdapter extends PayPalPayment {

    void doPayment(String token,double value){
        super.doPayment(token,new PaymentRequest(value,token));
    }

    void receivePayment(String token,double value){
        super.receivePayment(token,new PaymentRespose("wenaiisdjjiijs"));
    }
}
