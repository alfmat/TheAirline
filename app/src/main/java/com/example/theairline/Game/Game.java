package com.example.theairline.Game;

import com.example.theairline.Airline.Airline;
import com.example.theairline.Airline.AirlineImpl;
import com.example.theairline.Airline.American;
import com.example.theairline.Airline.Delta;
import com.example.theairline.Airline.Spirit;
import com.example.theairline.Airport.Airport;
import com.example.theairline.Airport.AirportImpl;
import com.example.theairline.Factory.Airplane;
import com.example.theairline.Factory.Factory;
import com.example.theairline.Finances.Bank;
import com.example.theairline.Finances.Charge;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Game {

    private List<Airline> airlines;
    private Bank theBank;
    private List<Airport> airports;
    private static Game game_instance;
    private Factory the_factory;


    private Game() {
        this.theBank = Bank.getInstance(1);
        this.airlines = new ArrayList<Airline>();
        this.airports = new ArrayList<Airport>();
        this.airlines.add(new AirlineImpl());
        this.airlines.add(new Delta());
        this.airlines.add(new Spirit());
        this.airlines.add(new American());
        this.the_factory = Factory.getInstance(1);
        for(int i = 0; i < 4; i++) {
            // loop must be used to add airlines to bank
            this.theBank.addAirline(this.airlines.get(i));
        }
        for(int i = 0; i < 10; i++) {
            this.airports.add(new AirportImpl());
        }
    }

    public static Game getInstance(int code) {
        if(game_instance == null || code == 1)
            game_instance = new Game();
        return game_instance;
    }

    public void performTurn(Map<Airplane, FlightPlan> plans) {
        for(int i = 0; i < this.airlines.size(); i++) {
            this.airports.get(i).issueFees();
        }
        List<Airplane> keys = new ArrayList<>(plans.keySet());
        for(int i = 0; i < plans.size(); i++) {
            keys.get(i).fly(plans.get(keys.get(i)).getDistance());
        }
    }

    public void purchasePlane(Airline m, Factory.plane_types t) {
        Charge to_attempt = new Charge(m, Factory.makePlane(t).getCost());
        if(theBank.canDoTransaction(to_attempt))
            theBank.processTransaction(to_attempt);
    }

    public boolean shouldContinue() {
        if(theBank.getBalance(this.airlines.get(0)) > 0) {
            return true;
        }
        return false;
    }

    public void userSetup(String name, String ceo) {
        this.airlines.get(0).setCeo(ceo);
        this.airlines.get(0).setName(name);
    }

    public Airline getAirline(int index) {
        return this.airlines.get(index);
    }

    public double getAccountBalance(Airline m) {
        return this.theBank.getBalance(m);
    }
}
