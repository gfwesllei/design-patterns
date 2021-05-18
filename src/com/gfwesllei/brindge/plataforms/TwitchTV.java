package com.gfwesllei.brindge.plataforms;

public class TwitchTV implements Plataform{
    public TwitchTV() {
        configureRMTP();
        System.out.println("Starting TwitchTV live");
    }

    @Override
    public void configureRMTP() {
        configureToken();
        System.out.println("Configuring TwitchTV RMTP");
    }

    @Override
    public void configureToken() {
        System.out.println("Authorized on TwitchTV token");
    }
}
