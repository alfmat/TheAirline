package com.example.theairline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.theairline.Game.Game;

public class SetupDone extends AppCompatActivity {

    private Game game;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup_done);

        this.game = Game.getInstance();

        while(this.game.shouldContinue()) {
            // perform some action
        }
    }
}
