package com.example.venkatesh.biggcfragment.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.venkatesh.biggcfragment.R;
import com.squareup.picasso.Picasso;

public class SpecialOffers extends PagerAdapter {
    Context context;

    public LayoutInflater layout;

    private  String [] imagess={"https://rukminim1.flixcart.com/image/704/704/support/x/g/h/33050-nivia-ws-583-original-imaey9t5yzenskbe.jpeg?q=70"
            ,"https://rukminim1.flixcart.com/image/704/704/sport-glove/d/m/8/710bk-left-right-80-nivia-9" +
            "-gym-fitness-gloves-crystal-l-original-imaen6cfxddtkkrc.jpeg?q=70",
            "https://www.permanad.se/wp-content/uploads/sites/4/2017/06/pixelxl_black.jpg",
            "https://www1-lw.xda-cdn.com/files/2018/01/GooglePay_Lockup.max-1000x1000.png",
            "http://192.168.0.115/editedcolors.png","http://192.168.0.115/editedcolors1.png"};
    //we have to set image size as 1920X820
    Integer[] intes={R.drawable.mobilles};

    @Override
    public int getCount() {
        return intes.length;
    }
   public SpecialOffers(Context context)
    {this.context=context;

    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layout=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view=layout.inflate(R.layout.offerspageadpter,null);
        ImageView offersimage=view.findViewById(R.id.offersimagepage);
     //   LinearLayout linearLayout=view.findViewById(R.id.background);
        Picasso.with(context).load(intes[position]).fit().into(offersimage);
        ViewPager pr=(ViewPager)container;
        pr.addView(view,0);
        offersimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context,String.valueOf(position),Toast.LENGTH_SHORT).show();
            }
        });
        return view;


    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager vp=(ViewPager) container;
        View view=(View) object;
        vp.removeView(view);
    }
}
