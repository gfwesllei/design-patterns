package com.gfwesllei.abstractfactory.aircraft;

public class Helicopter implements AirCraftVehicle{
    public void startRoute() {
        getWind();
        getCargo();
        System.out.println("Passageiros em transito");
    }

    public void getCargo() {
        System.out.println("Iniciando embarque");
    }

    public void getWind() {
        System.out.println("Vendos a 25km");
        System.out.println("Ventos ok, pode proceguir");
    }
}
