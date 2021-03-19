package com.example.projetandroidappgestionfournisseurs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Inscription extends AppCompatActivity {
    TextView seConnecter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        seConnecter = findViewById(R.id.ConnectezVous);
        seConnecter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inscription.this, SeConnecter.class);
                startActivity(intent);
            }
        });
    }
}