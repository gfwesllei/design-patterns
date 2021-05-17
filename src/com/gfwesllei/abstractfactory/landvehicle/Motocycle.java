package com.gfwesllei.abstractfactory.landvehicle;

public class Motocycle implements LandVehicle{
    public void startRoute() {
        getCargo();
        System.out.println("Pegando encomenda");
    }

    public void getCargo() {
        System.out.println("Inciando entrega");
    }
}
