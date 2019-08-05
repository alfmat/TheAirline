package com.example.theairline.Game;

import com.example.theairline.Airline.Airline;
import com.example.theairline.Airline.AirlineImpl;
import com.example.theairline.Airport.Airport;
import com.example.theairline.Airport.AirportImpl;
import com.example.theairline.Finances.Bank;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Airline> airlines;
    private Bank theBank;
    private List<Airport> airports;
    private static Game game_instance;

    private Game() {
        this.theBank = Bank.getInstance();
        this.airlines = new ArrayList<Airline>();
        this.airports = new ArrayList<Airport>();
        this.airlines.add(new AirlineImpl());
        for(int i = 0; i < 3; i++) {
            Airline to_add = new AirlineImpl();
            this.airlines.add(to_add);
            this.theBank.addAirline(to_add);
        }
        for(int i = 0; i < 10; i++) {
            this.airports.add(new AirportImpl());
        }
    }

    public static Game getInstance() {
        if(game_instance == null)
            game_instance = new Game();
        return game_instance;
    }

    public void performTurn() {
        for(int i = 0; i < this.airlines.size(); i++) {
            this.airports.get(i).issueFees();
        }
    }

    public boolean shouldContinue() {
        if(theBank.getBalance(this.airlines.get(0)) > 0) {
            return true;
        }
        return false;
    }

    public void createNewGame() {
        game_instance = new Game();
    }
}
