package com.gfwesllei.abstractfactory.app;

import com.gfwesllei.abstractfactory.aircraft.AirCraftVehicle;
import com.gfwesllei.abstractfactory.factory.TransportFactory;
import com.gfwesllei.abstractfactory.landvehicle.LandVehicle;

public class ApplicationFactory {

    private AirCraftVehicle airCraftVehicle;
    private LandVehicle landVehicle;
    public ApplicationFactory(TransportFactory transportFactory) {
        airCraftVehicle =transportFactory.createTransportAirCraft();
        landVehicle =transportFactory.createLandTransport();
    }

    public void startRoute(){
        airCraftVehicle.startRoute();
        landVehicle.startRoute();
    }
}
