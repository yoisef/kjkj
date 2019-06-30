package com.example.youssef.ar_foods;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    TabLayout mytab;
    ViewPager mypager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mytab=findViewById(R.id.mytabapp);
        mypager=findViewById(R.id.pagerview);
        TabLayout.Tab egytap=mytab.newTab();
        TabLayout.Tab Gulftap=mytab.newTab();
        TabLayout.Tab Syrtap=mytab.newTab();

        mytab.addTab(egytap);

        // made by Freepik from www.flaticon.com
        mytab.addTab(Gulftap);

        //Icon made by Vitaly Gorbachev from www.flaticon.com

        mytab.addTab(Syrtap);





        mypager.setAdapter(new pageradapter(getSupportFragmentManager()));
        mytab.setupWithViewPager(mypager);

           egytap.setText("Egyptian Food");    //Icon made by Pixel perfect from www.flaticon.com
        egytap.setIcon(R.drawable.egypt);

        Gulftap.setText("Gulf Food");
        Gulftap.setIcon(R.drawable.saudia);

        Syrtap.setText("Syrian food");
        Syrtap.setIcon(R.drawable.syria);


        mytab.setSelectedTabIndicatorHeight((int) (5 * getResources().getDisplayMetrics().density));
        mytab.setTabTextColors(Color.parseColor("#727272"), Color.parseColor("#3498DB"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);

        // return true so that the menu pop up is opened
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.favoselected: {

                startActivity(new Intent(MainActivity.this,favouritactivity.class));
                return true;
            }
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    class pageradapter extends FragmentPagerAdapter{

        public pageradapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            Fragment mycurrentfrag=new Fragment();
            switch (position)
            {
                case 0:mycurrentfrag= new syrfrag();
                break;
                case 1:mycurrentfrag=new gulffrag();
                break;
                case 2:mycurrentfrag=new egyptfragment();
                break;


            }
            return  mycurrentfrag;

        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
