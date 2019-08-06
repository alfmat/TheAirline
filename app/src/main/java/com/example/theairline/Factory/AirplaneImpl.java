package com.example.theairline.Factory;

public class AirplaneImpl implements Airplane {

    protected String name;
    protected double num_passengers;
    protected double pass_capacity;
    private double fuel;
    protected double burn_rate;
    private int health;
    private double tank_capacity;
    private double mileage;
    private boolean needs_service;
    protected int cost;

    public AirplaneImpl() {
        this.name = "Boeing";
        this.num_passengers = 0;
        this.pass_capacity = 100;
        this.fuel = 100;
        this.tank_capacity = 100;
        this.burn_rate = 0.05;
        this.health = 100;
        this.mileage = 0;
        this.needs_service = false;
        this.cost = 100;
    }

    public AirplaneImpl(String n, int cap, double b_r) {
        this();
        this.name = n;
        this.pass_capacity = cap;
        this.burn_rate = b_r;
    }

    public String getName() {
        return this.name;
    }
    public double getNumberOfPassengers(){
        return this.num_passengers;
    }
    public double getCapacity(){
        return this.pass_capacity;
    }
    public double getFuelStatus(){
        return this.fuel;
    }
    public double getBurnRate(){
        return this.burn_rate;
    }
    public double getMileage(){
        return this.mileage;
    }
    public int getHealth() {
        return this.health;
    }
    public boolean getServiceStatus(){
        return this.needs_service;
    }
    public int getCost() {
        return this.cost;
    }

    public void setFuel(double f) {
        this.fuel = f;
    }

    public void performService(Service obj) {
        if(obj.getGoAhead()) {
            this.health = 100;
            this.needs_service = false;
            this.fuel = this.tank_capacity;
        }
    }

    public void fly(double dist) {
        if(this.fuel < this.burn_rate * dist || this.health < 0) {
            throw new RuntimeException();
        }
        this.fuel = this.fuel - this.burn_rate * dist;
        this.health -= dist * 0.02;
        this.mileage += dist;
        if (health < 30) {
            this.needs_service = true;
        }
    }
}
