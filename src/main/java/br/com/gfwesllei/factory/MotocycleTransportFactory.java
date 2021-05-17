package br.com.gfwesllei.factory;

import br.com.gfwesllei.vehicles.Motocycle;
import br.com.gfwesllei.vehicles.Vehicle;

public class MotocycleTransportFactory extends Transport{

    protected Vehicle createTransporte() {
        return new Motocycle();
    }
}
