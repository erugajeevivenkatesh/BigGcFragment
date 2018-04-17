package com.example.venkatesh.biggcfragment.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.venkatesh.biggcfragment.Adapters.ViewpageAdapter;
import com.example.venkatesh.biggcfragment.R;

public class MobilesFragment extends Fragment {
    ViewPager ImagesPager;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
            View view=inflater.inflate(R.layout.mobilescatogeries,container,false);
        ImagesPager=view.findViewById(R.id.Mobileimagesss);
        ViewpageAdapter viewpageAdapter=new ViewpageAdapter(getContext());
        ImagesPager.setAdapter(viewpageAdapter);
            return view;
    }
}
