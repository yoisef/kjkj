package com.example.youssef.ar_foods;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.youssef.ar_foods.egyptadapter.adapteraklat;

import java.util.ArrayList;
import java.util.Set;

public class favouritactivity extends AppCompatActivity {

    RecyclerView myrecycle;
    foodtypes foodtypesl;
    ArrayList<String> mylist,favolist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favouritactivity);

        favolist=new ArrayList<>();

        adapteraklat myadapter=new adapteraklat();


      /*
        SharedPreferences sharedPref = getSharedPreferences("first",this.MODE_PRIVATE);


       String favourit=sharedPref.getString("key","hi");

               mylist.add(favourit);
               */

       myrecycle=findViewById(R.id.favorecycle);
       myrecycle.setLayoutManager(new LinearLayoutManager(this));
       myrecycle.setAdapter(new favoadapter(this,favolist));





    }
}
