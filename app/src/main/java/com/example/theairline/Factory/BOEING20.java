package com.example.theairline.Factory;

public class BOEING20 extends AirplaneImpl implements Airplane {

    private Airplane boeing_20;
    private Factory.plane_types type;

    public BOEING20() {
        this.name = "BOEING 40";
        this.burn_rate = 0.1;
        this.pass_capacity = 40;
        this.type = Factory.plane_types.BOEING20;
        this.cost = 2000;
    }

    public Factory.plane_types getType() {
        return this.type;
    }
}
