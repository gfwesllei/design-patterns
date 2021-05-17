package com.gfwesllei.abstractfactory.aircraft;

public class AirPlane implements AirCraftVehicle {
    public void startRoute() {

        getWind();
        getCargo();
        System.out.println("Voo autorizado, iniciando rota");
    }

    public void getCargo() {
        System.out.println("Checkin finalizado");
    }

    public void getWind() {
        System.out.println("Ventos estão ok, 25km/h");
    }
}
