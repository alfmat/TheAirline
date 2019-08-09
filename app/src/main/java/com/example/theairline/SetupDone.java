package com.example.theairline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.theairline.Game.Game;
import com.example.theairline.Game.UserDetails;

public class SetupDone extends AppCompatActivity {

    private Game game;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup_done);

        this.game = Game.getInstance(1);
        UserDetails user = UserDetails.getInstance("","",0);

        TextView heading = (TextView)findViewById(R.id.textView2);
        heading.setText("Welcome " + user.getUserName());

        Button restart = (Button)findViewById(R.id.button4);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                completeRestart();
            }
        });

        Button view_planes = (Button)findViewById(R.id.button);
        view_planes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Button view_finances = (Button)findViewById(R.id.button2);
        view_finances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                financeReveal();
            }
        });

        Button turn = (Button)findViewById(R.id.button3);
        turn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                planTurn();
            }
        });
    }

    public void completeRestart() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void financeReveal() {
        Intent intent = new Intent(this, FinanceView.class);
        startActivity(intent);
    }

    public void planeReveal() {
        Intent intent = new Intent(this, Airplanes.class);
        startActivity(intent);
    }

    public void planTurn() {
        Intent intent = new Intent(this, PlanTurn.class);
        startActivity(intent);
    }

}
