package com.abbad.a01_pro_ba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.location.GnssAntennaInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class MainActivity extends AppCompatActivity {

    private List<Persona> personaList = new ArrayList<>();

//    public void onCreate()

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // old =  activity_main    prosmotr_personcontact
        // тестовая запить для проверки.
        personaList.add(new Persona("TestName1","Test name2", "TestFaml", "+38080044405", "90876214893", "Test"));
        //окно прокрутки контактов. RecyclerView + Adapter
        RecyclerView recyclerView = findViewById(R.id.scroll_contact);
        AdapterForPers adapterForPers = new AdapterForPers(personaList);
        recyclerView.setAdapter(adapterForPers);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));




        }
    public void buttonClicNewContact (View view){
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }

}

