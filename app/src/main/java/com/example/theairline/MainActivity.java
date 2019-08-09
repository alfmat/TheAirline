package com.example.theairline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.theairline.Game.UserDetails;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name = (EditText)findViewById(R.id.nameText);
        final EditText airline_name = (EditText) findViewById(R.id.airlineName);

        Button submit = (Button)findViewById(R.id.beginButton);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserDetails.getInstance(name.getText().toString(),airline_name.getText().toString(),1);
                openSetupDone();
            }
        });
    }

    public void openSetupDone() {
        Intent intent = new Intent(this, SetupDone.class);
        startActivity(intent);
    }

}
