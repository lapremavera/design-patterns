package com.realdolmen.ood020.factorymethod;

public class VehicleCreatorImpl implements VehicleCreator {
    @Override
    public Vehicle createVehicle(boolean typeVoertuig, int noPass, String reg, int berths) {
        if(typeVoertuig) {
            return new Vehicle(noPass, reg);

        } else {
            return new Truck(noPass, reg, berths);
        }
    }
}
