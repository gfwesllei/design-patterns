package com.gfwesllei.brindge.transmissions;

import com.gfwesllei.brindge.plataforms.Plataform;

public class AdvacedLive extends Live {

    public AdvacedLive(Plataform plataform) {
        this.plataform=plataform;
    }

    public void configureSubtitle(){
        System.out.println("Subtitle enabled");
    }

    public void configureChat(){
        System.out.println("Chat enabled");
    }
}
