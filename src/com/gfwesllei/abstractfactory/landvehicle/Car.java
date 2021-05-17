package com.gfwesllei.abstractfactory.landvehicle;

public class Car implements LandVehicle{
    public void startRoute() {
        getCargo();
        System.out.println("Pegando passageiros");
    }

    public void getCargo() {
        System.out.println("Iniciando corrida");
    }
}
