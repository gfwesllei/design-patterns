package com.gfwesllei.brindge.transmissions;

import com.gfwesllei.brindge.plataforms.Plataform;

public class RecordedLive extends  AdvacedLive{
    public RecordedLive(Plataform plataform) {
        super(plataform);
    }

    public void startRecord(){
        System.out.println("Start recording");
    }

    public void stopRecord(){
        System.out.println("Start recording");
    }
}
