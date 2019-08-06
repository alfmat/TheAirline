package com.example.theairline.Game;

import com.example.theairline.Factory.Airplane;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestGameComponents {
    /*
    This is the file that will be used for testing the various aspects of the game
     */
    public static void main(String args[]) {
        Game the_game = Game.getInstance(1);
        Scanner sc = new Scanner(System.in);

        the_game.userSetup("Alfred Air","Alfred");
        System.out.println("Setup complete\n\nHere are all airlines:");

        for(int i = 0; i < 4; i++) {
            System.out.println(the_game.getAirline(i).getName());
        }

        // testing the ability of the game to perform a flight
        FlightPlan.destinations start = FlightPlan.destinations.BOSTON;
        FlightPlan.destinations dest = FlightPlan.destinations.HOUSTON;

        // performs a turn
        Map<Airplane, FlightPlan> turn1 = new HashMap<Airplane, FlightPlan>();
        turn1.put(the_game.getAirline(0).getPlane(0), new FlightPlan(start,dest));
        the_game.performTurn(turn1);
        System.out.println("Flight complete:\n" + the_game.getAirline(0).getPlane(0).getMileage() +
                "\nHealth: " + the_game.getAirline(0).getPlane(0).getHealth());
        the_game.performTurn(turn1);
        System.out.println("Flight complete:\n" + the_game.getAirline(0).getPlane(0).getMileage() +
                "\nHealth: " + the_game.getAirline(0).getPlane(0).getHealth());



        System.out.print(the_game.getAccountBalance(the_game.getAirline(0)));


    }
}
