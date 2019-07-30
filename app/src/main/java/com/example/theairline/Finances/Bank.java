package com.example.theairline.Finances;

import com.example.theairline.Airline.Airline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {

    private static Bank ourInstance;
    private Map<Airline,Double> airlines;


    public static Bank getInstance() {
        if(ourInstance == null)
            ourInstance = new Bank();
        return ourInstance;
    }

    private Bank() {
        this.airlines = new HashMap<Airline,Double>();
    }

    public void addAirline(Airline the_air) {
        this.airlines.put(the_air,10000.0);
    }

    public void removeAirline(Airline the_air) {
        this.airlines.remove(the_air);
    }

    public void charge(Airline key, double amt) {
        double bal = this.airlines.get(key);
        bal -= amt;
        this.airlines.remove(key);
        this.airlines.put(key, bal);
    }


}
