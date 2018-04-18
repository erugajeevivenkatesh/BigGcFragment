package com.example.venkatesh.biggcfragment.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.venkatesh.biggcfragment.R;
import com.squareup.picasso.Picasso;

public class TodayDeals extends Fragment {
    Integer[] drawablee={R.drawable.mobilles,R.drawable.offers,R.drawable.featuredmobiles,R.drawable.laptopoffers};
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.todaydealsfragment,container,false);
        ImageView im1=view.findViewById(R.id.Imageview1);
        ImageView im2=view.findViewById(R.id.Imageview2);
        ImageView im3=view.findViewById(R.id.Imageview3);
        ImageView im4=view.findViewById(R.id.Imageview4);
        ImageView[] ids={im1,im2,im3,im4};
       for(int i=0;i<drawablee.length;i++)
       {
           Picasso.with(getContext()).load(drawablee[i]).fit().centerCrop().into(ids[i]);
       }
       return view;
    }
}
