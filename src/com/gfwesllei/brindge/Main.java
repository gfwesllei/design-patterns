package com.gfwesllei.brindge;

import com.gfwesllei.brindge.plataforms.Plataform;
import com.gfwesllei.brindge.plataforms.Youtube;
import com.gfwesllei.brindge.transmissions.Live;

public class Main {

    public static void main(String[] args) {
        startLive(new Youtube());
    }

    public static void startLive(Plataform plataform){

        System.out.println("Await start live");
        Live live = new Live(plataform);
        live.broadcasting();
        live.result();
    }
}
