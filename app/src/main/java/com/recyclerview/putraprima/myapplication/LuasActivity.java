package com.recyclerview.putraprima.myapplication;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasActivity extends AppCompatActivity {
    private EditText edtPanjang;
    private EditText edtLebar;
    private Button btnLuas;
    private TextView txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas);

        edtLebar = findViewById(R.id.edtLebar);
        edtPanjang = findViewById(R.id.edtPanjang);
        btnLuas = findViewById(R.id.btnLuas);
        txtLuas = findViewById(R.id.txtLuas);

        btnLuas.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Float Luas = (float) (Integer.parseInt(edtLebar.getText().toString()) * Integer.parseInt(edtPanjang.getText().toString()));
                txtLuas.setText(Luas.toString());
            }
        });


    }
}
