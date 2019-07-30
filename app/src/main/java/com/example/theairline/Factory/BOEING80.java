package com.example.theairline.Factory;

public class BOEING80 extends AirplaneImpl implements Airplane {

    private Airplane boeing_40;
    private Factory.plane_types type;

    public BOEING80() {
        this.name = "BOEING 80";
        this.burn_rate = 0.1;
        this.pass_capacity = 40;
        this.type = Factory.plane_types.BOEING80;
    }

    public Factory.plane_types getType() {
        return this.type;
    }
}
