package com.example.theairline.Factory;

import com.example.theairline.Airline.Airline;

public class Factory {
    private static Factory the_factory;
    private Factory() {
    }

    public static Factory getInstance(int code) {
        if(the_factory == null || code == 1)
            the_factory = new Factory();
        return the_factory;
    }

    public Airplane makePlane(String n, int p_c, double b_r) {
        return new AirplaneImpl(n, p_c, b_r);
    }

    public void servicePlane(Airplane plane) {
        plane.performService(new Service());
    }

    public void refuelPlane(Airplane plane, double f) {
        plane.setFuel(f);
    }

    public enum plane_types {
        BOEING40, AIRBUS100, BOEING80, BOEING20, AIRBUS140
    }

    public static Airplane makePlane(plane_types desired_type) {
        if(desired_type == plane_types.BOEING20)
            return new BOEING20();
        else if(desired_type == plane_types.BOEING40)
            return new BOEING40();
        else if(desired_type == plane_types.BOEING80)
            return new BOEING80();
        else if(desired_type == plane_types.AIRBUS100)
            return new AIRBUS100();
        else if(desired_type == plane_types.AIRBUS140)
            return new AIRBUS140();
        else
            throw new RuntimeException();
    }
}

class Service {
    private boolean go_ahead;
    public Service() {
        go_ahead = true;
    }
    public boolean getGoAhead() { return this.go_ahead; }
}
