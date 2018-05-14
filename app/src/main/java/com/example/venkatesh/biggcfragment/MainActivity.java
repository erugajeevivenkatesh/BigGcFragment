package com.example.venkatesh.biggcfragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.transition.ChangeBounds;
import android.transition.Slide;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.venkatesh.biggcfragment.Fragments.CategoryFragment;
import com.example.venkatesh.biggcfragment.Fragments.Homefragment;
import com.example.venkatesh.biggcfragment.Fragments.OrdersFragment;
import com.example.venkatesh.biggcfragment.Fragments.TodayDeals;
import com.example.venkatesh.biggcfragment.Fragments.WishListFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    public  boolean searchbutton;

    TransistionofAllfragments transistionofAllfragments=new TransistionofAllfragments();
    CardView Category;
    LinearLayout searchproduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        searchbutton=false;
        getSupportActionBar().setTitle("Nixinn");
        LinearLayout notifcation=toolbar.findViewById(R.id.notification);
         searchproduct=toolbar.findViewById(R.id.searchproducts);
        searchproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SearchItem.class));
            }
        });
        notifcation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "no notifications", Toast.LENGTH_SHORT).show();
            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        transistionofAllfragments.Homefraagment(false,getFragmentManager());

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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

        int id = item.getItemId();

//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if(id==R.id.Home)
        {
          Serachproductvisibility(false);
           transistionofAllfragments.Homefraagment(false,getFragmentManager());
        }
        else if(id==R.id.shopbycategory)
        {
            Serachproductvisibility(true);
           transistionofAllfragments.Catogoryfragment(false,getFragmentManager());
        }
        else if (id==R.id.Todaydeals)
        {
            Serachproductvisibility(true);
            transistionofAllfragments.Todaydealsfragment(false,getFragmentManager());
        }
        else if(id==R.id.yourorders)

        {
            Serachproductvisibility(true);
            transistionofAllfragments.moveordersfragment(false,getFragmentManager());
        }
        else if(id==R.id.yourwisilist)
        {
            Serachproductvisibility(true);
            transistionofAllfragments.movewishlistfragment(false,getFragmentManager());
        }

        else if (id == R.id.nav_share) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void Serachproductvisibility(boolean search)
    {
        if(search)

        searchproduct.setVisibility(View.VISIBLE);
        else
        {
            searchproduct.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    protected void onResume() {
        Log.v("searchbutton","false");
        if(searchbutton)
        {
            Log.v("searchbutton","true");
            Serachproductvisibility(true);
        }
        else
        { Log.v("searchbutton","false");
            Serachproductvisibility(false);

        }
            super.onResume();
    }
}
