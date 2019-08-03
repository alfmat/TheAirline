package com.example.theairline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.theairline.Airline.Airline;
import com.example.theairline.Airline.AirlineImpl;
import com.example.theairline.Airport.Airport;
import com.example.theairline.Airport.AirportImpl;
import com.example.theairline.Finances.Bank;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Airline> airlines;
    private Bank theBank;
    private List<Airport> airports;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView Head = (TextView)findViewById(R.id.headText);
        ProgressBar money = (ProgressBar)findViewById(R.id.Money);

        money.setMax(100);
        money.setProgress(100);

        this.createGame("Alfred Air", "Alfred");
    }

    public void createGame(String user_airline, String user_name) {
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

    public void performTurn() {
        //more code to come
    }

}
