package br.com.gfwesllei.factory;

import br.com.gfwesllei.vehicles.Bike;
import br.com.gfwesllei.vehicles.Vehicle;

public class BikeTransportFactory extends Transport{
    @Override
    protected Vehicle createTransporte() {
        return new Bike();
    }
}
