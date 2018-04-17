package com.example.venkatesh.biggcfragment.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.transition.ChangeBounds;
import android.transition.Slide;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.venkatesh.biggcfragment.Adapters.CategoryArrayAdapter;
import com.example.venkatesh.biggcfragment.ArrayList.Category;
import com.example.venkatesh.biggcfragment.MainActivity;
import com.example.venkatesh.biggcfragment.R;

import java.util.ArrayList;
import java.util.List;

public class CategoryFragment extends Fragment {
    public List<Category> catlistdata=new ArrayList<>();
    ListView Catdatalist;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.categoryfragment,container,false);

        AddCaegoryinfo();
        Catdatalist =view.findViewById(R.id.Catdatalist);
        CategoryArrayAdapter catadapter=new CategoryArrayAdapter(getContext(),0,catlistdata);
        Catdatalist.setAdapter(catadapter);
        Catdatalist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                Category cat=catlistdata.get(position);
                Bundle catitem=new Bundle();
                catitem.putString("categoryItem",cat.getCatitems());
                addNextFragment(false,catitem);
                Toast.makeText(getContext(), cat.getCatitems(), Toast.LENGTH_SHORT).show();

            }
        });

        return  view;
    }
    public void AddCaegoryinfo()
    {   Category catdata=new Category("Mobiles");
        catlistdata.add(catdata);
        catdata=new Category("Accesories");
        catlistdata.add(catdata);
        catdata=new Category("Pc&Laptops");
        catlistdata.add(catdata);
        catdata=new Category("Featured Phones");
        catlistdata.add(catdata);
    }
    private void addNextFragment( boolean overlap,Bundle b) {
        ItemsPageFragment sharedElementFragment2 = new ItemsPageFragment();
        sharedElementFragment2.setArguments(b);
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

        catlistdata.clear();
        getFragmentManager().beginTransaction()
                .replace(R.id.Main, sharedElementFragment2)
                .addToBackStack(null)
                .commit();
    }

}

