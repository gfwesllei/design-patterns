package com.gfwesllei.abstractfactory.factory;

import com.gfwesllei.abstractfactory.aircraft.AirCraftVehicle;
import com.gfwesllei.abstractfactory.landvehicle.LandVehicle;

public interface TransportFactory {

    LandVehicle createLandTransport();
    AirCraftVehicle createTransportAirCraft();
}
