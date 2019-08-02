package com.example.theairline.Airline;

import com.example.theairline.Factory.Airplane;
import com.example.theairline.Factory.Factory;

import java.util.ArrayList;
import java.util.List;

public class AirlineImpl implements Airline {

    // fields
    private String name;
    private String ceo;
    private int emp_count;
    private List<Airplane> airplanes;

    public AirlineImpl() {
        this.name = "New Airline";
        this.ceo = "Sam";
        this.emp_count = 2000;
        this.airplanes = new ArrayList<Airplane>();
        for(int i = 0; i < 2; i++)
            this.airplanes.add(Factory.makePlane(Factory.plane_types.BOEING20));

    }

    public AirlineImpl(String airline_name) {
        this();
        this.name = airline_name;
    }

    public AirlineImpl(String name_air, String ce, double mon_count, int emp) {
        this.name = name_air;
        this.ceo = ce;
        this.emp_count = emp;
    }

    public String getCeoName() {
        return this.ceo;
    }

    public String getName(){
        return this.name;
    }

    public double getNumberPlanes(){
        return this.airplanes.size();
    }

    public int getEmpCount() {
        return this.emp_count;
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
