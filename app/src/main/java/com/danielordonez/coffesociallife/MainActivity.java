package com.danielordonez.coffesociallife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button coffeOrigin,coffeHouseOrigin,burocracy,present,evolution, information, health;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coffeOrigin = (Button)findViewById(R.id.btnOrigenCafe);
        coffeHouseOrigin =(Button)findViewById(R.id.btnOrigenCasa);
        burocracy =(Button)findViewById(R.id.btnBurocracia);
        present=(Button)findViewById(R.id.btnActualidad);
        evolution=(Button)findViewById(R.id.btnEvolucion);
        information=(Button)findViewById(R.id.btnInformacion);
        health=(Button)findViewById(R.id.btnSalud);

        coffeOrigin.setOnClickListener(this);
        coffeHouseOrigin.setOnClickListener(this);
        burocracy.setOnClickListener(this);
        present.setOnClickListener(this);
        evolution.setOnClickListener(this);
        information.setOnClickListener(this);
        health.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnOrigenCafe)
        {
            startActivity(new Intent(this,CoffeOriginActivity.class));
        }
        if(v.getId()==R.id.btnOrigenCasa)
        {
            startActivity(new Intent(this,CoffeHouse.class));
        }
        if(v.getId()==R.id.btnBurocracia)
        {
            startActivity(new Intent(this,Burocracy.class));
        }
        if(v.getId()==R.id.btnActualidad)
        {
            startActivity(new Intent(this,Present.class));
        }
        if(v.getId()==R.id.btnEvolucion)
        {
            startActivity(new Intent(this,Evolution.class));
        }
        if(v.getId()==R.id.btnInformacion)
        {
            startActivity(new Intent(this,Information.class));
        }
        if(v.getId()==R.id.btnSalud)
        {
            startActivity(new Intent(this,Health.class));
        }
    }
}
