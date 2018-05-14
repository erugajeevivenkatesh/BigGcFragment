package com.example.venkatesh.biggcfragment.Fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.CardView;
import android.transition.ChangeBounds;
import android.transition.Slide;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;

import com.example.venkatesh.biggcfragment.Adapters.Featuredmobiles;
import com.example.venkatesh.biggcfragment.Adapters.OffersPagerAdapter;
import com.example.venkatesh.biggcfragment.Adapters.SpecialOffers;
import com.example.venkatesh.biggcfragment.MainActivity;
import com.example.venkatesh.biggcfragment.R;
import com.example.venkatesh.biggcfragment.SearchItem;
import com.example.venkatesh.biggcfragment.TransistionofAllfragments;
import com.squareup.picasso.Picasso;

import me.relex.circleindicator.CircleIndicator;

public class Homefragment extends Fragment  {
    public Context context;
    TransistionofAllfragments transistionofAllfragments=new TransistionofAllfragments();
    MainActivity  mainActivity=new MainActivity();
    ViewPager offers,Mobilesoffers,FeaturedOffer;
    CardView shopbycategry;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.mainpagedata,container,false);
        shopbycategry=view.findViewById(R.id.category);

        final Button Searchitem=view.findViewById(R.id.seachitems);
            ImageView specialoffers=view.findViewById(R.id.Imview1);
            ImageView mobilesoffers=view.findViewById(R.id.Imview2);
            ImageView upcomingoffers=view.findViewById(R.id.Imview3);
        mainActivity.searchbutton=true;
        Picasso.with(getContext()).load(R.drawable.upcomming).fit().into(upcomingoffers);
        Picasso.with(getContext()).load(R.drawable.laptopoffers).fit().into(mobilesoffers);
        Picasso.with(getContext()).load(R.drawable.featuredmobiles).fit().into(specialoffers);
        specialoffers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.searchbutton=true;
               transistionofAllfragments.Speialofferfragment(false,getFragmentManager());
               // Speialofferfragment(false);
            }
        });
        mobilesoffers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.searchbutton=true;
            transistionofAllfragments.mobileofferfragment(false,getFragmentManager());
            }
        });
        upcomingoffers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.searchbutton=true;
                transistionofAllfragments.upcoomingoffer(false,getFragmentManager());
            }
        });
        Searchitem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.searchbutton=true;
                startActivity(new Intent(getContext(),SearchItem.class));
            }
        });

        shopbycategry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.searchbutton=true;
                transistionofAllfragments.Catogoryfragment( false,getFragmentManager());
            }
        });


  return view;

    }

    @Override
    public void onResume() {
        mainActivity.searchbutton=true;
        super.onResume();
    }
}
