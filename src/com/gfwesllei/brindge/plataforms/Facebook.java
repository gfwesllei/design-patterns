package com.gfwesllei.brindge.plataforms;

public class Facebook implements Plataform{

    public Facebook() {
        configureRMTP();
        System.out.println("Starting Facebook live");
    }

    @Override
    public void configureRMTP() {
        configureToken();
        System.out.println("Configuring Facebook RMTP");
    }

    @Override
    public void configureToken() {
        System.out.println("Authorized on Facebook token");
    }
}
