package com.recyclerview.putraprima.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BrowserActivity extends AppCompatActivity {
    private Button btnBrowse;
    private EditText edtUlr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);
        btnBrowse = findViewById(R.id.btnBrowse);
        edtUlr = findViewById(R.id.edtUrl);

        btnBrowse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = edtUlr.getText().toString();
                Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
