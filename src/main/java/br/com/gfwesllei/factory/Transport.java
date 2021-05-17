package br.com.gfwesllei.factory;

import br.com.gfwesllei.vehicles.Vehicle;

public abstract class Transport {

    public void startTransport(){
        Vehicle vehicle = createTransporte();
        vehicle.startRouter();
    }

    protected abstract Vehicle createTransporte();
}
