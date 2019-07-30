package com.example.theairline.Airline;

public class AirlineImpl implements Airline {

    // fields
    private String name;
    private String ceo;
    private int emp_count;
    private int airplane_count;

    public AirlineImpl() {
        this.name = "New Airline";
        this.ceo = "Sam";
        this.emp_count = 2000;
        this.airplane_count = 10;
    }

    public AirlineImpl(String airline_name) {
        this();
        this.name = airline_name;
    }

    public AirlineImpl(String name_air, String ce, double mon_count, int emp,
                       int no_air) {
        this.name = name_air;
        this.ceo = ce;
        this.emp_count = emp;
        this.airplane_count = no_air;
    }

    public String getCeoName() {
        return this.ceo;
    }

    public String getName(){
        return this.name;
    }

    public double getNumberPlanes(){
        return this.airplane_count;
    }
}
