package com.gfwesllei.abstractfactory;

import com.gfwesllei.abstractfactory.app.ApplicationFactory;
import com.gfwesllei.abstractfactory.enuns.Company;
import com.gfwesllei.abstractfactory.factory.NineNineTransportFactory;
import com.gfwesllei.abstractfactory.factory.TransportFactory;
import com.gfwesllei.abstractfactory.factory.UberTransportFactory;

public class Main {

    public static ApplicationFactory configureApplication(){
        ApplicationFactory application;
        TransportFactory transportFactory;
        String compay = Company.NINENINE.name();

        if(compay.equals(Company.UBER.name())){
            transportFactory = new UberTransportFactory();
        }else {
            transportFactory = new NineNineTransportFactory();
        }
        application = new ApplicationFactory(transportFactory);
        return application;
    }
    public static void main(String[] args) {

        var applicationFactory = configureApplication();
        applicationFactory.startRoute();
    }
}
