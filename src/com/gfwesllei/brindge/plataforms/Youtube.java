package com.gfwesllei.brindge.plataforms;

public class Youtube implements Plataform{
    public Youtube() {
        configureRMTP();
        System.out.println("Starting Youtube live");
    }

    @Override
    public void configureRMTP() {
        configureToken();
        System.out.println("Configuring Youtube RMTP");
    }

    @Override
    public void configureToken() {
        System.out.println("Authorized on Youtube token");
    }
}
