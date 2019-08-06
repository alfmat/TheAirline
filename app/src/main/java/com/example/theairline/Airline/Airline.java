package com.example.theairline.Airline;

import com.example.theairline.Factory.Airplane;

public interface Airline {
    String getCeoName();
    String getName();
    double getNumberPlanes();
    Airplane getPlane(int i);
    void addPlane(Airplane newPlane);
    void removePlane(Airplane remove);
    void setName(String s);
    void setCeo(String s);
}
