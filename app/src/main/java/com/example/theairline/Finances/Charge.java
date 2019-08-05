package com.example.theairline.Finances;

import com.example.theairline.Airline.Airline;

public class Charge {
    /*
    This class will be used by Banks, Airports, and other components to issue charges to the
    various airlines

    0 --> money is to be withdrawn
    1 --> money is to be added
     */
    private Airline to_be_charged;
    private double amt;
    private int type;

    public Charge(Airline k, double a, int t) {
        this.to_be_charged = k;
        this.amt = a;
        this.type = t;
    }

    public Charge(Airline k, double a) {
        this.type = 0;
        this.to_be_charged = k;
        this.amt = a;
    }

    public double getAmount() {
        if(this.type == 0) {
            return -1*this.amt;
        }
        return this.amt;
    }

    public Airline getAirline() {
        return this.to_be_charged;
    }

}
