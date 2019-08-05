package com.example.theairline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = (EditText)findViewById(R.id.nameText);
        EditText airline_name = (EditText) findViewById(R.id.airlineName);

        Button submit = (Button)findViewById(R.id.beginButton);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSetupDone();
            }
        });
    }

    public void openSetupDone() {
        Intent intent = new Intent(this, SetupDone.class);
        startActivity(intent);
    }

}
