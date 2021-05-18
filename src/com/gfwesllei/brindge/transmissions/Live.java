package com.gfwesllei.brindge.transmissions;

import com.gfwesllei.brindge.plataforms.Plataform;

public class Live implements Transmission{

    protected Plataform plataform;

    public  Live(){

    }

    public  Live(Plataform plataform){

        this.plataform=plataform;
    }

    @Override
    public void broadcasting() {
        System.out.println("Inciando broadcasting transmission");
    }

    @Override
    public void result() {
        System.out.println("******* On line ******");

    }
}
