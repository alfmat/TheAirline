package com.example.theairline.Factory;

public interface Airplane {

    String getName();
    double getNumberOfPassengers();
    double getCapacity();
    double getFuelStatus();
    double getBurnRate();
    double getMileage();
    int getHealth();
    boolean getServiceStatus();
    void performService(Service obj);
    void fly(double dist);
    int getCost();
}