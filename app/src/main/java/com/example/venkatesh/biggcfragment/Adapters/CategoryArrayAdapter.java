package com.example.venkatesh.biggcfragment.Adapters;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.transition.ChangeBounds;
import android.transition.Slide;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.venkatesh.biggcfragment.ArrayList.Category;
import com.example.venkatesh.biggcfragment.Fragments.CategoryFragment;
import com.example.venkatesh.biggcfragment.Fragments.ItemsPageFragment;
import com.example.venkatesh.biggcfragment.R;

import java.util.ArrayList;
import java.util.List;

public class CategoryArrayAdapter extends ArrayAdapter<Category> {

    public CategoryArrayAdapter(@NonNull Context context, int resource, @NonNull List<Category> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listitem=convertView;
        if(listitem==null)
        {
        listitem= LayoutInflater.from(getContext()).inflate(R.layout.categorydata,parent,false);
        }
        Category category=getItem(position);
        String catitem=category.getCatitems();
        final TextView textView=listitem.findViewById(R.id.Categoryitems);
        textView.setText(catitem);



        return listitem;
    }
//    private void addNextFragment( boolean overlap) {
//        ItemsPageFragment sharedElementFragment2 = new ItemsPageFragment();
//
//        Slide slideTransition = new Slide(Gravity.END);
//        slideTransition.setDuration(100);
//        Slide exitleft=new Slide(Gravity.START);
//        exitleft.setDuration(100);
//        ChangeBounds changeBoundsTransition = new ChangeBounds();
//        changeBoundsTransition.setDuration(100);
//
//        sharedElementFragment2.setEnterTransition(slideTransition);
//        sharedElementFragment2.setAllowEnterTransitionOverlap(overlap);
//        sharedElementFragment2.setExitTransition(exitleft);
//        sharedElementFragment2.setAllowReturnTransitionOverlap(overlap);
//        sharedElementFragment2.setSharedElementEnterTransition(changeBoundsTransition);
//
//
//
//
//        getFragmentManager().beginTransaction()
//                .replace(R.id.Main, sharedElementFragment2)
//                .addToBackStack(null)
//                .commit();
//    }



}
