package com.example.theairline.Factory;

public class AIRBUS140 extends AirplaneImpl implements Airplane {

    private Factory.plane_types type;

    public AIRBUS140() {
        this.name = "AIRBUS 140";
        this.burn_rate = 0.1;
        this.pass_capacity = 40;
        this.type = Factory.plane_types.AIRBUS140;
        this.cost = 10000;
    }

    public Factory.plane_types getType() {
        return this.type;
    }
}
