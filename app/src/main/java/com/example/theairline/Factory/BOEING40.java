package com.example.theairline.Factory;

public class BOEING40 extends AirplaneImpl implements Airplane{

    private Airplane boeing_40;
    private Factory.plane_types type;

    public BOEING40() {
        this.name = "BOEING 40";
        this.burn_rate = 0.1;
        this.pass_capacity = 40;
        this.type = Factory.plane_types.BOEING40;
        this.cost = 3500;
    }

    public Factory.plane_types getType() {
        return this.type;
    }
}
