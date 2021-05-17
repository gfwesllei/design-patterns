package br.com.gfwesllei.factory;

import br.com.gfwesllei.vehicles.Car;
import br.com.gfwesllei.vehicles.Vehicle;

public class CarTransporteFactory extends Transport{
    protected Vehicle createTransporte() {
        return new Car();
    }
}
