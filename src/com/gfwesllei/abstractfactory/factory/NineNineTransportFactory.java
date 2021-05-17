package com.gfwesllei.abstractfactory.factory;

import com.gfwesllei.abstractfactory.aircraft.AirCraftVehicle;
import com.gfwesllei.abstractfactory.aircraft.Helicopter;
import com.gfwesllei.abstractfactory.landvehicle.LandVehicle;
import com.gfwesllei.abstractfactory.landvehicle.Motocycle;

public class NineNineTransportFactory implements TransportFactory{

    public LandVehicle createLandTransport() {
        return new Motocycle();
    }

    public AirCraftVehicle createTransportAirCraft() {
        return new Helicopter();
    }
}
