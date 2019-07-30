package com.example.theairline.Airport;

import java.util.ArrayList;
import java.util.List;
import com.example.theairline.Airline.*;

public class AirportImpl implements Airport {

    private String name;
    private double transaction_rate;
    private double daily_fee;
    private int traffic;
    private List<Airline> air_lines;

    public AirportImpl() {
        this.name = "Milwaukee Regional Airport";
        this.transaction_rate = 0.05;
        this.daily_fee = 30;
        this.traffic = 3000;
        this.air_lines = new ArrayList<Airline>();
    }

    public AirportImpl(String n) {
        this();
        this.name = n;
    }

    public AirportImpl(String n, double t_r, double d_f, int tr, ArrayList<Airline> air) {
        this(n);
        this.transaction_rate = t_r;
        this.daily_fee = d_f;
        this.air_lines = air;
    }

    public String getName() {
        return this.name;
    }

    public double getAirportRate() {
        return this.transaction_rate;
    }

    public double getTraffic() {
        return this.traffic;
    }

    public double getDailyFee(){
        return this.daily_fee;
    }

}
