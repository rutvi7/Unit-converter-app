package com.example.dedsgift.rendom;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        t1 = (TextView) findViewById(R.id.textView1);           //for textview1//
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity1();
            }
        });

        t2 = (TextView) findViewById(R.id.textView2);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity2();
            }
        });

        t3 = (TextView) findViewById(R.id.textView3);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity3();
            }
        });

        t4 = (TextView) findViewById(R.id.textView4);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity4();
            }
        });

        t5 = (TextView) findViewById(R.id.textView5);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity5();
            }
        });


        t6 = (TextView) findViewById(R.id.textView6);
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity6();
            }
        });

        t7 = (TextView) findViewById(R.id.textView7);
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity7();
            }
        });

        t8 = (TextView) findViewById(R.id.textView8);
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity8();
            }
        });

        t9 = (TextView) findViewById(R.id.textView9);
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity9();
            }
        });

        t10 = (TextView) findViewById(R.id.textView10);
        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity10();
            }
        });

        t11 = (TextView) findViewById(R.id.textView11);
        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity11();
            }
        });

        t12 = (TextView) findViewById(R.id.textView12);
        t12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity12();
            }
        });

        t13 = (TextView) findViewById(R.id.textView13);
        t13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity13();
            }
        });

        t14 = (TextView) findViewById(R.id.textView14);
        t14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity14();
            }
        });

    }


    public void openactivity1(){                                        //for textview1//

        Intent intent= new Intent(this,activity1.class);
        startActivity(intent);
    }
    public void openactivity2(){

        Intent intent= new Intent(this,activity2.class);
        startActivity(intent);
    }
    public void openactivity3(){

        Intent intent= new Intent(this,activity3.class);
        startActivity(intent);
    }
    public void openactivity4(){

        Intent intent= new Intent(this,activity4.class);
        startActivity(intent);
    }
    public void openactivity5(){

        Intent intent= new Intent(this,activity5.class);
        startActivity(intent);
    }
    public void openactivity6(){

        Intent intent= new Intent(this,activity6.class);
        startActivity(intent);
    }
    public void openactivity7(){

        Intent intent= new Intent(this,activity7.class);
        startActivity(intent);
    }
    public void openactivity8(){

        Intent intent= new Intent(this,activity8.class);
        startActivity(intent);
    }
    public void openactivity9(){

        Intent intent= new Intent(this,activity9.class);
        startActivity(intent);
    }
    public void openactivity10(){

        Intent intent= new Intent(this,activity10.class);
        startActivity(intent);
    }
    public void openactivity11(){

        Intent intent= new Intent(this,activity11.class);
        startActivity(intent);
    }
    public void openactivity12(){

        Intent intent= new Intent(this,activity12.class);
        startActivity(intent);
    }

    public void openactivity13(){

        Intent intent= new Intent(this,activity_activity13.class);
        startActivity(intent);
    }

    public void openactivity14(){

        Intent intent= new Intent(this,activity_activity14.class);
        startActivity(intent);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_dis) {

            Intent cIntent = new Intent(this, activity1.class);
            startActivity(cIntent);

        } else if (id == R.id.nav_are) {

            Intent cIntent = new Intent(this, activity2.class);
            startActivity(cIntent);

        } else if (id == R.id.nav_vol) {

            Intent cIntent = new Intent(this, activity3.class);
            startActivity(cIntent);

        } else if (id == R.id.nav_wei) {

            Intent cIntent = new Intent(this, activity4.class);
            startActivity(cIntent);

        } else if (id == R.id.nav_time) {

            Intent cIntent = new Intent(this, activity5.class);
            startActivity(cIntent);

        } else if (id == R.id.nav_temp) {

            Intent cIntent = new Intent(this, activity6.class);
            startActivity(cIntent);

        } else if (id == R.id.nav_freq) {

            Intent cIntent = new Intent(this, activity7.class);
            startActivity(cIntent);

        } else if (id == R.id.nav_speed) {

            Intent cIntent = new Intent(this, activity8.class);
            startActivity(cIntent);

        } else if (id == R.id.nav_energy) {

            Intent cIntent = new Intent(this, activity9.class);
            startActivity(cIntent);

        } else if (id == R.id.nav_ang) {

            Intent cIntent = new Intent(this, activity10.class);
            startActivity(cIntent);

        } else if (id == R.id.nav_pre) {

            Intent cIntent = new Intent(this, activity11.class);
            startActivity(cIntent);

        } else if (id == R.id.nav_fule) {

            Intent cIntent = new Intent(this, activity12.class);
            startActivity(cIntent);

        } else if (id == R.id.nav_digitals) {

            Intent cIntent = new Intent(this, activity_activity13.class);
            startActivity(cIntent);

        } else if (id == R.id.nav_dtr) {

            Intent cIntent = new Intent(this, activity_activity14.class);
            startActivity(cIntent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
