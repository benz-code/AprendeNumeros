package com.example.parcialnumeros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer sonido;
    public ImageButton cero;
    public ImageButton uno;
    public ImageButton dos;
    public ImageButton tres;
    public ImageButton cuatro;
    public ImageButton cinco;
    public ImageButton seis;
    public ImageButton siete;
    public ImageButton ocho;
    public ImageButton nueve;
    public ImageButton diez;
    Button boton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton=(Button) findViewById(R.id.btnsiguiente);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(getApplicationContext(),Integrantes.class);
                startActivity(b);
            }
        });

        cero=(ImageButton) findViewById(R.id.imgcero);
        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Precionaste el numero cero.", Toast.LENGTH_LONG).show();
                sonido= MediaPlayer.create(getApplicationContext(), R.raw.ncero);
                sonido.start();
            }
        });
        uno=(ImageButton) findViewById(R.id.imguno);
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Precionaste el numero uno.", Toast.LENGTH_LONG).show();
                sonido= MediaPlayer.create(getApplicationContext(), R.raw.nuno);
                sonido.start();
            }
        });
        dos=(ImageButton) findViewById(R.id.imgdos);
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Precionaste el numero dos.", Toast.LENGTH_LONG).show();
                sonido= MediaPlayer.create(getApplicationContext(), R.raw.ndos);
                sonido.start();
            }
        });
        tres=(ImageButton) findViewById(R.id.imgtres);
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Precionaste el numero tres.", Toast.LENGTH_LONG).show();
                sonido= MediaPlayer.create(getApplicationContext(), R.raw.ntres);
                sonido.start();
            }
        });
        cuatro=(ImageButton) findViewById(R.id.imgcuatro);
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Precionaste el numero cuatro.", Toast.LENGTH_LONG).show();
                sonido= MediaPlayer.create(getApplicationContext(), R.raw.ncuatro);
                sonido.start();
            }
        });
        cinco=(ImageButton) findViewById(R.id.imgcinco);
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Precionaste el numero cinco.", Toast.LENGTH_LONG).show();
                sonido= MediaPlayer.create(getApplicationContext(), R.raw.ncinco);
                sonido.start();
            }
        });
        seis=(ImageButton) findViewById(R.id.imgseis);
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Precionaste el numero seis.", Toast.LENGTH_LONG).show();
                sonido= MediaPlayer.create(getApplicationContext(), R.raw.nseis);
                sonido.start();
            }
        });
        siete=(ImageButton) findViewById(R.id.imgsiete);
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Precionaste el numero siete.", Toast.LENGTH_LONG).show();
                sonido= MediaPlayer.create(getApplicationContext(), R.raw.nsiete);
                sonido.start();
            }
        });
        ocho=(ImageButton) findViewById(R.id.imgocho);
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Precionaste el numero ocho.", Toast.LENGTH_LONG).show();
                sonido= MediaPlayer.create(getApplicationContext(), R.raw.nocho);
                sonido.start();
            }
        });
        nueve=(ImageButton) findViewById(R.id.imgnueve);
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Precionaste el numero nueve.", Toast.LENGTH_LONG).show();
                sonido= MediaPlayer.create(getApplicationContext(), R.raw.nnueve);
                sonido.start();
            }
        });
        diez=(ImageButton) findViewById(R.id.imgdiez);
        diez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Precionaste el numero diez.", Toast.LENGTH_LONG).show();
                sonido= MediaPlayer.create(getApplicationContext(), R.raw.ndiez);
                sonido.start();
            }
        });




    }
}