package com.example.venkatesh.biggcfragment.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.transition.ChangeBounds;
import android.transition.Slide;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.venkatesh.biggcfragment.Adapters.MobileInfoArrayAdapter;
import com.example.venkatesh.biggcfragment.ArrayList.MobilesInfo;
import com.example.venkatesh.biggcfragment.R;
import com.example.venkatesh.biggcfragment.Recycleroptioins.RecyclerTouchListener;

import java.util.ArrayList;
import java.util.List;

public class ItemsPageFragment extends Fragment{

    private List<MobilesInfo> mobilelists=new ArrayList<>();
    public View views;
    LinearLayout Mobilesdata,Nodatalayout;

    public MobileInfoArrayAdapter mobileInfoArrayAdapter;
    RecyclerView recycler;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.itemslayout,container,false);
        String value = getArguments().getString("categoryItem");
        Mobilesdata =view.findViewById(R.id.Loadingpage);
        Nodatalayout=view.findViewById(R.id.Nodatalayout);
        views=view;
        loadingseveralpages(value);

        TextView txt=view.findViewById(R.id.text);
        txt.setText(value);
        return view;

    }

    private void loadingseveralpages(String value) {
        switch (value)
        {
            case "Mobiles":
                preparemobiledata();
                Mobilesdata.setVisibility(View.VISIBLE);
                Nodatalayout.setVisibility(View.INVISIBLE);
                loadiingmobiles();
                break;
            case  "Accesories":
                break;
            case  "Pc&Laptops":
                break;
            case  "Featured Phones":
                break;
        }
    }

    private void loadiingmobiles() {
        recycler=views.findViewById(R.id.Recycleddata);

        mobileInfoArrayAdapter=new MobileInfoArrayAdapter(getActivity(),mobilelists);
        RecyclerView.LayoutManager mLayoutmanager=new LinearLayoutManager(getContext());
        recycler.setLayoutManager(mLayoutmanager);
        recycler.setHasFixedSize(true);
        recycler.setItemAnimator(new DefaultItemAnimator());
        recycler.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayoutManager.VERTICAL));
        recycler.setAdapter(mobileInfoArrayAdapter);
        recycler.addOnItemTouchListener(new RecyclerTouchListener(getContext(), recycler, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                MobilesInfo info=mobilelists.get(position);
                Toast.makeText(getContext(), info.getKey(), Toast.LENGTH_SHORT).show();
                addNextFragment(false);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }
    private void preparemobiledata() {
        //(String key,String Title,String Price,String Description,String Color,String ImageUrl)
        MobilesInfo mobilesInfo=new MobilesInfo("1","Mi AL DUAL CAMERA","5000","goodmobile","Black","https://rukminim1.flixcart.com/image/704/704/j7gi6q80/mobile/p/t/d/lenovo-k8-plus-pa8c0003in-original-imaexp2rupxj9w5f.jpeg?q=70");
        mobilelists.add(mobilesInfo);
        mobilesInfo=new MobilesInfo("2","Mi AL DUAL CAMERA","5000","goodmobile","Black","https://rukminim1.flixcart.com/image/704/704/j7gi6q80/mobile/p/t/d/lenovo-k8-plus-pa8c0003in-original-imaexp2rupxj9w5f.jpeg?q=70");
        mobilelists.add(mobilesInfo);
        mobilesInfo=new MobilesInfo("3","Mi AL howo CAMERA","0100","goodmobile","Black","https://rukminim1.flixcart.com/image/704/704/j7gi6q80/mobile/p/t/d/lenovo-k8-plus-pa8c0003in-original-imaexp2rupxj9w5f.jpeg?q=70");
        mobilelists.add(mobilesInfo);
        mobilesInfo=new MobilesInfo("4","Mi AL how CAMERA","505400","goodmobile","Black","https://rukminim1.flixcart.com/image/704/704/j7gi6q80/mobile/p/t/d/lenovo-k8-plus-pa8c0003in-original-imaexp2rupxj9w5f.jpeg?q=70");
        mobilelists.add(mobilesInfo);
    }
    private void addNextFragment( boolean overlap) {
        ProductDetailsFragment sharedElementFragment2 = new ProductDetailsFragment();
       // sharedElementFragment2.setArguments(b);
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

      //  catlistdata.clear();
        getFragmentManager().beginTransaction()
                .replace(R.id.Main, sharedElementFragment2)
                .addToBackStack(null)
                .commit();
    }


}
