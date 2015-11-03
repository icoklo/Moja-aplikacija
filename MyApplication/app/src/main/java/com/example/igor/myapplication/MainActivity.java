package com.example.igor.myapplication;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button gumb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickButtonListener();

        Test test;
        for(int i=1;i<=5;i++) {
            test = new Test("ime " + i, "prezime " + i, 12);
            test.lista.add(test);
            // Log.d("oznakaFor", "velicina:" + test.lista.size());
        }

        Test pomoc=new Test();
        int velicina=pomoc.lista.size();
        Log.d("oznaka1","velicina:"+velicina);
        // ispis sloziti jos

        // foreach petlja
        for(Test t:pomoc.lista){
            Log.d("ispis","korisnik:"+t.lista.indexOf(t)+" "+t.getIme()+t.getPrezime());
            // testni komentar
        }

    }

    public void onClickButtonListener(){

        gumb=(Button)findViewById(R.id.button);
        gumb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.igor.myapplication.DrugiEkran");
                startActivity(intent);
            }
        });

    }





}
