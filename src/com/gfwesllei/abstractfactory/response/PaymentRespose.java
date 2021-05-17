package com.gfwesllei.abstractfactory.response;

public class PaymentRespose {

    private String idTransactional;

    public PaymentRespose(String idTransactional) {
        this.idTransactional = idTransactional;
    }

    public String getIdTransactional() {
        return idTransactional;
    }

    public void setIdTransactional(String idTransactional) {
        this.idTransactional = idTransactional;
    }
}
