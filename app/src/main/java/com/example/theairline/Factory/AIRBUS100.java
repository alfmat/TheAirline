package com.example.theairline.Factory;

public class AIRBUS100 extends AirplaneImpl implements Airplane {

    private Airplane boeing_40;
    private Factory.plane_types type;

    public AIRBUS100() {
        this.name = "AIRBUS 100";
        this.burn_rate = 0.1;
        this.pass_capacity = 40;
        this.type = Factory.plane_types.AIRBUS100;
    }

    public Factory.plane_types getType() {
        return this.type;
    }
}
