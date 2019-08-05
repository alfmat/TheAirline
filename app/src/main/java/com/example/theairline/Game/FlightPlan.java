package com.example.theairline.Game;

import com.example.theairline.Airline.Airline;

public class FlightPlan {
    /*
    This will be the class that details the flight plans
    for each airline in each turn
     */

    private destinations start;
    private destinations end;
    private double distance;

    public enum destinations {
        BOSTON, CHICAGO, MINNEAPOLIS, HOUSTON, DALLAS, WASHINGTONDC, ATLANTA, RALEIGH, CHARLESTON,
        NEWYORK, PHILADELPHIA, ORLANDO
    }

    public FlightPlan(FlightPlan.destinations s, FlightPlan.destinations e) {
        this.start = s;
        this.end = e;
        this.distance = this.computeDistance();
    }

    private double computeDistance() {
        return Math.random() * 1000.0;
    }

    public double getDistance() {
        return this.distance;
    }
}
