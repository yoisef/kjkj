package com.example.youssef.ar_foods;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class enteractivity extends AppCompatActivity {


    TextView converttoarabic,converttoenglish;
    Button enterapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enteractivity);


        converttoarabic=findViewById(R.id.arabictext);
        converttoenglish=findViewById(R.id.englishtext);
        enterapp=findViewById(R.id.enterapplication);


        converttoarabic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                changelanguage("ar");
                restart();



            }
        });


        converttoenglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                changelanguage("en");
                restart();

            }
        });


        enterapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(enteractivity.this,MainActivity.class));
            }
        });




    }


    public void changelanguage(String localcode)
    {



        Resources res=getResources();
        DisplayMetrics dm=res.getDisplayMetrics();
        Configuration conf=res.getConfiguration();
        if (Build.VERSION.SDK_INT >= 17)
        {
            conf.setLocale(new Locale(localcode.toLowerCase()));
        }
        else{
            conf.locale=new Locale(localcode.toLowerCase());
        }
        res.updateConfiguration(conf,dm);
    }

    public void restart ()
    {
        Intent i = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage( getBaseContext().getPackageName() );
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
}
