package com.realdolmen.ood020.factorymethod;

public interface VehicleCreator {
    Vehicle createVehicle(boolean typeVoertuig, int noPass, String reg, int berths);
}
