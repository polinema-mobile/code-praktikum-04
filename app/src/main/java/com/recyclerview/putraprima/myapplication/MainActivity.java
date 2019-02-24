package com.recyclerview.putraprima.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnLuas,btnCalculator,btnRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLuas = findViewById(R.id.btnLuas);
        btnCalculator = findViewById(R.id.btnCalculator);
        btnRecycler = findViewById(R.id.btnRecycler);

        btnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),LuasActivity.class);
                startActivity(i);
            }
        });


    }
}
