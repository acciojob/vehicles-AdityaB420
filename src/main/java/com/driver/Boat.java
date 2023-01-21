package com.driver;

public class Boat implements WaterVehicle{
    @Override
    public String getVehicleName() {
        return "liberty";
    }

    @Override
    public int getVehicleCapacity() {
        return 8;
    }
}
