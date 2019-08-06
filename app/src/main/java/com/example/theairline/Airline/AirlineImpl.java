package com.example.theairline.Airline;

import com.example.theairline.Factory.Airplane;
import com.example.theairline.Factory.Factory;
import com.example.theairline.Game.FlightPlan;

import java.util.ArrayList;
import java.util.List;

public class AirlineImpl implements Airline {

    // fields
    private String name;
    private String ceo;
    private List<Airplane> airplanes;

    public AirlineImpl() {
        this.name = "New Airline";
        this.ceo = "Sam";
        this.airplanes = new ArrayList<Airplane>();
        for(int i = 0; i < 2; i++)
            this.airplanes.add(Factory.makePlane(Factory.plane_types.BOEING20));

    }

    public AirlineImpl(String airline_name) {
        this();
        this.name = airline_name;
    }

    public AirlineImpl(String name_air, String ce, double mon_count) {
        this.name = name_air;
        this.ceo = ce;
    }

    public void conductFlight(Airplane k, FlightPlan f) {
        try {
            k.fly(f.getDistance());
        } catch (RuntimeException e) {
            System.out.println("Plane has crashed");
        }
    }

    public String getCeoName() {
        return this.ceo;
    }

    public String getName(){
        return this.name;
    }

    public Airplane getPlane(int i) {
        return this.airplanes.get(i);
    }

    public double getNumberPlanes(){
        return this.airplanes.size();
    }

    public void setCeo(String n) {
        this.ceo = n;
    }

    public void setName(String n){
        this.name = n;
    }

    public void addPlane(Airplane newPlane) {
        this.airplanes.add(newPlane);
    }

    public void removePlane(Airplane oldPlane) {
        this.airplanes.remove(oldPlane);
    }
}
