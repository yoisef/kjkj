package com.example.youssef.ar_foods;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.youssef.ar_foods.egyptadapter.adapteraklat;
import com.example.youssef.ar_foods.egyptadapter.adapteraklat2;
import com.example.youssef.ar_foods.egyptadapter.adapteraklat3;
import com.example.youssef.ar_foods.egyptadapter.adapteraklat4;
import com.example.youssef.ar_foods.gulfadapters.adapteraklat10;
import com.example.youssef.ar_foods.gulfadapters.adapteraklat11;
import com.example.youssef.ar_foods.gulfadapters.adapteraklat12;
import com.example.youssef.ar_foods.gulfadapters.adapteraklat9;
import com.example.youssef.ar_foods.syriaadapter.adapteraklat5;
import com.example.youssef.ar_foods.syriaadapter.adapteraklat6;
import com.example.youssef.ar_foods.syriaadapter.adapteraklat7;
import com.example.youssef.ar_foods.syriaadapter.adapteraklat8;

import java.util.ArrayList;

public class foodsnames extends AppCompatActivity {


    RecyclerView foodtypesre;


    ArrayList<foodtypes> main,side,entreess,saladd,soupp, main1,side1,entreess1,saladd1,soupp1, main2,side2,entreess2,saladd2,soupp2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodsnames);



        foodtypesre=findViewById(R.id.foodrecycle);
        foodtypesre.setHasFixedSize(true);
        foodtypesre.setLayoutManager(new GridLayoutManager(this,2));
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        int highScore = preferences.getInt("position", 0);
        int pos1=preferences.getInt("position1",0);
        int pos2=preferences.getInt("position2",0);


        main=new ArrayList<>();
        side=new ArrayList<>();
        entreess=new ArrayList<>();
        saladd=new ArrayList<>();
        soupp=new ArrayList<>();
        main1=new ArrayList<>();
        side1=new ArrayList<>();
        entreess1=new ArrayList<>();
        saladd1=new ArrayList<>();
        soupp1=new ArrayList<>();
        main2=new ArrayList<>();
        side2=new ArrayList<>();
        entreess2=new ArrayList<>();
        saladd2=new ArrayList<>();
        soupp2=new ArrayList<>();

        main.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.alexsusage)));
        main.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.beanwithfriedeggs)));
        main.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.StuffedChickenRoll)));
        main.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.GreenMallochia)));
        main.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.EgyptianKoshri)));
        main.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.ZucchiniwithBechamel)));
        main.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.TorleyCasserolewithMeat)));
        main.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.Chiliprawns)));
        main.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.Besara)));
        main.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.Artichokebakedwithspinachandcream)));
        main.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.Nersco)));
        main.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.CrispyChickenBalls)));

        saladd.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.BabaGhanoug)));
        saladd.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.Saladflour)));
        saladd.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.Spicypotatosalad)));
        saladd.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.Hummussalad)));
        saladd.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.Saladodcoolslo)));
        saladd.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.Taboulehsaladwithpomegranateseeds)));
        saladd.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.Piesalad)));
        saladd.add(new foodtypes(R.drawable.egyptf,"Caesar salad with pastao"));
        saladd.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.Beetsalad)));
        saladd.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.Eggplantsalad)));
        saladd.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.Watercresssalad)));
        saladd.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.Pastasaladwithtuna)));
        saladd.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.Tunasaladwithpotatoes)));

        soupp.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.lentilsoupwithgreenonions)));
        soupp.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.ricesoupworkswithoatmealandchickenstrips)));
        soupp.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.cabbagesoupandbasil)));
        soupp.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.Soupofabirdwithvegetables)));
        soupp.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.garlicsoup)));
        soupp.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.ricesoupworkswithoatmealandchickenstrips)));

        entreess.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.Basbousastuffedwithcream)));
        entreess.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.Ricewithmilk)));
        entreess.add(new foodtypes(R.drawable.egyptf,"Bullying with puddles"));
        entreess.add(new foodtypes(R.drawable.egyptf,getResources().getString(R.string.BasbousaOrio)));



        main1.add(new foodtypes(R.drawable.syri,getResources().getString(R.string.SaudiKabsawithmeat)));
        main1.add(new foodtypes(R.drawable.syri,getResources().getString(R.string.yellowricewithchicken)));
        main1.add(new foodtypes(R.drawable.syri,getResources().getString(R.string.Hotcauliflowersauce)));
        main1.add(new foodtypes(R.drawable.syri,getResources().getString(R.string.ChickenMandy)));
        main1.add(new foodtypes(R.drawable.syri,getResources().getString(R.string.ChickenTandoori)));
        main1.add(new foodtypes(R.drawable.syri,getResources().getString(R.string.Shakshukamincedmeat)));

        saladd1.add(new foodtypes(R.drawable.syri,getResources().getString(R.string.Pomegranatesaladwithspinachhealth)));
        saladd1.add(new foodtypes(R.drawable.syri,getResources().getString(R.string.Flowersaladwitholiveoil)));
        saladd1.add(new foodtypes(R.drawable.syri,getResources().getString(R.string.Saladwithgoatcheese)));
        saladd1.add(new foodtypes(R.drawable.syri,getResources().getString(R.string.Fatoshsalad)));
        saladd1.add(new foodtypes(R.drawable.syri,"Salad of Capricorn with Almocarilla"));
        saladd1.add(new foodtypes(R.drawable.syri,"Beet with fresh cheese with only two ingredients"));


        soupp1.add(new foodtypes(R.drawable.syri,"Artichoke soup with milk and onions"));
        soupp1.add(new foodtypes(R.drawable.syri,"Gulf soup with vegetables and dates"));
        soupp1.add(new foodtypes(R.drawable.syri,"Creamy mushroom soup"));
        soupp1.add(new foodtypes(R.drawable.syri,"Spinach soup with Spaghetti Spaghetti"));
        soupp1.add(new foodtypes(R.drawable.syri,"Al Rayhan Soup"));

        entreess1.add(new foodtypes(R.drawable.syri,"Dates rolls "));
        entreess1.add(new foodtypes(R.drawable.syri,"Chocolate tablets "));
        entreess1.add(new foodtypes(R.drawable.syri,"Swords "));
        entreess1.add(new foodtypes(R.drawable.syri,"Mini Tart with cashew and apricot jam "));
        entreess1.add(new foodtypes(R.drawable.syri,"Minced cake with dried fruits "));
        entreess1.add(new foodtypes(R.drawable.syri,"Cookie Butter Cookies"));
        entreess1.add(new foodtypes(R.drawable.syri,"Mini Tart with Strawberry Jam "));



        main2.add(new foodtypes(R.drawable.gulffood,"Shawrma breaad"));
        main2.add(new foodtypes(R.drawable.gulffood,"Kufti Halabi"));
        main2.add(new foodtypes(R.drawable.gulffood,"Perfect Mkdos"));
        main2.add(new foodtypes(R.drawable.gulffood,"Burn Finger "));
        main2.add(new foodtypes(R.drawable.gulffood,"Main chicken Shawrma"));
        main2.add(new foodtypes(R.drawable.gulffood,"Omelet with cheese"));
      main2.add(new foodtypes(R.drawable.gulffood,"Chicken Tray with Potato Oven"));

      saladd2.add(new foodtypes(R.drawable.gulffood,"Taboula quinoa"));
        saladd2.add(new foodtypes(R.drawable.gulffood,"Tomato salad with oil and sumac"));
        saladd2.add(new foodtypes(R.drawable.gulffood,"the brick balls salad"));
        saladd2.add(new foodtypes(R.drawable.gulffood,"Salad with parsley"));
        saladd2.add(new foodtypes(R.drawable.gulffood,"Potato salad with yogurt and tomatoes"));
        saladd2.add(new foodtypes(R.drawable.gulffood,"Beetroot salad"));
        saladd2.add(new foodtypes(R.drawable.gulffood,"Potato salad with cheese"));

        soupp2.add(new foodtypes(R.drawable.gulffood,"Red beets with garlic and chickpeas"));
        soupp2.add(new foodtypes(R.drawable.gulffood,"Cauliflower soup with crushed almonds"));
        soupp2.add(new foodtypes(R.drawable.gulffood,"Potato soup and carrot cream"));
        soupp2.add(new foodtypes(R.drawable.gulffood,"Milk Soup"));
        soupp2.add(new foodtypes(R.drawable.gulffood,"Soup of the bird with mushrooms"));
        soupp2.add(new foodtypes(R.drawable.gulffood,"Pasta and vegetable soup"));
        soupp2.add(new foodtypes(R.drawable.gulffood,"Cold Tibola Soup"));

        entreess2.add(new foodtypes(R.drawable.entrees,"Mango baloza"));
        entreess2.add(new foodtypes(R.drawable.entrees,"Syrian Beatifour"));
        entreess2.add(new foodtypes(R.drawable.entrees,"Hala Al-Athamleh"));
        entreess2.add(new foodtypes(R.drawable.entrees,"Delicious almond biscuits"));
        entreess2.add(new foodtypes(R.drawable.entrees,"Baloza Balbashen grapefruit"));
        entreess2.add(new foodtypes(R.drawable.entrees,"Potato Cake with Cinnamon"));
        entreess2.add(new foodtypes(R.drawable.entrees,"Syrian rice"));










        Intent intent=getIntent();
        int value=   intent.getIntExtra("content",0);

        switch (value)
        {
            case 11:{
                foodtypesre.setAdapter(new adapteraklat(this,main));
                break;

            }
            case 21:{
                foodtypesre.setAdapter(new adapteraklat9(this,main1));
                break;
            }

            case 12:{
                foodtypesre.setAdapter(new adapteraklat2(this,saladd));
                break;
            }
            case 13:{
                foodtypesre.setAdapter(new adapteraklat3(this,soupp));
                break;

            }
            case 14:{
                foodtypesre.setAdapter(new adapteraklat4(this,entreess));
                break;

            }
            case 22:{
                foodtypesre.setAdapter(new adapteraklat10(this,saladd1));
                break;

            }
            case 23:{
                foodtypesre.setAdapter(new adapteraklat11(this,soupp1));
                break;

            }
            case 24:{
                foodtypesre.setAdapter(new adapteraklat12(this,entreess1));
                break;

            }
            case 31:{
                foodtypesre.setAdapter(new adapteraklat5(this,main2));
                break;

            }
            case 32:{
                foodtypesre.setAdapter(new adapteraklat6(this,saladd2));
                break;

            }
            case 33:{
                foodtypesre.setAdapter(new adapteraklat7(this,soupp2));
                break;

            }
            case 34:{
                foodtypesre.setAdapter(new adapteraklat8(this,entreess2));
                break;

            }

        }





    }


}
