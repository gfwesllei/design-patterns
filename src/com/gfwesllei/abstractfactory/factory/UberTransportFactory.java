package com.gfwesllei.abstractfactory.factory;

import com.gfwesllei.abstractfactory.aircraft.AirCraftVehicle;
import com.gfwesllei.abstractfactory.aircraft.AirPlane;
import com.gfwesllei.abstractfactory.landvehicle.Car;
import com.gfwesllei.abstractfactory.landvehicle.LandVehicle;

public class UberTransportFactory implements TransportFactory{

    public LandVehicle createLandTransport() {
        return new Car();
    }

    public AirCraftVehicle createTransportAirCraft() {
        return new AirPlane();
    }
}
