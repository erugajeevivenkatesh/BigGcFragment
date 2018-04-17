package com.example.venkatesh.biggcfragment.Fragments;

import android.app.Fragment;
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

import com.example.venkatesh.biggcfragment.Adapters.Featuredmobiles;
import com.example.venkatesh.biggcfragment.Adapters.OffersPagerAdapter;
import com.example.venkatesh.biggcfragment.Adapters.SpecialOffers;
import com.example.venkatesh.biggcfragment.MainActivity;
import com.example.venkatesh.biggcfragment.R;
import com.example.venkatesh.biggcfragment.SearchItem;

import me.relex.circleindicator.CircleIndicator;

public class Homefragment extends Fragment {
    public Context context;


    public  Homefragment newinstance(Context context)
    {
        this.context=context;
        Homefragment hm=new Homefragment();
        return hm;
    }

    ViewPager offers,Mobilesoffers,FeaturedOffers;
    CardView shopbycategry;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.mainpagedata,container,false);
        shopbycategry=view.findViewById(R.id.category);
        final Button Searchitem=view.findViewById(R.id.seachitems);
        OffersPagerAdapter viewpageAdapter=new OffersPagerAdapter(getContext());
        offers=view.findViewById(R.id.Offers);
        Mobilesoffers=view.findViewById(R.id.Mobilesoffers);
        FeaturedOffers=view.findViewById(R.id.featuredoffers);
        offers.setAdapter(viewpageAdapter);
        Mobilesoffers.setAdapter(new Featuredmobiles((getContext())));
        FeaturedOffers.setAdapter(new SpecialOffers((getContext())));
        CircleIndicator indicator = (CircleIndicator) view.findViewById(R.id.indicator);
        indicator.setViewPager(offers);
        indicator.setViewPager(Mobilesoffers);
        indicator.setViewPager(FeaturedOffers);

        Searchitem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),SearchItem.class));
            }
        });


        shopbycategry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNextFragment( false);
            }
        });

  return view;

    }

    private void addNextFragment( boolean overlap) {
        CategoryFragment sharedElementFragment2 = new CategoryFragment();

        Slide slideTransition = new Slide(Gravity.END);
        slideTransition.setDuration(getResources().getInteger(R.integer.anim_duration_medium));
        Slide exitleft=new Slide(Gravity.START);
        exitleft.setDuration(getResources().getInteger(R.integer.anim_duration_medium));
        ChangeBounds changeBoundsTransition = new ChangeBounds();
        changeBoundsTransition.setDuration(getResources().getInteger(R.integer.anim_duration_medium));

        sharedElementFragment2.setEnterTransition(slideTransition);
        sharedElementFragment2.setAllowEnterTransitionOverlap(overlap);
        sharedElementFragment2.setExitTransition(exitleft);
        sharedElementFragment2.setAllowReturnTransitionOverlap(overlap);
        sharedElementFragment2.setSharedElementEnterTransition(changeBoundsTransition);

        getFragmentManager().beginTransaction()
                .replace(R.id.Main, sharedElementFragment2)
                .addToBackStack(null)
                .commit();
    }



}
