package com.example.venkatesh.biggcfragment.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.venkatesh.biggcfragment.R;
import com.squareup.picasso.Picasso;

public class ViewpageAdapter extends PagerAdapter {
    private Context context;
    private LayoutInflater layout;
    private Integer[] images= new Integer[3];
    String [] imagess={"https://rukminim1.flixcart.com/image/704/704/support/x/g/h/33050-nivia-ws-583-original-imaey9t5yzenskbe.jpeg?q=70"
            ,"https://rukminim1.flixcart.com/image/704/704/sport-glove/d/m/8/710bk-left-right-80-nivia-9" +
            "-gym-fitness-gloves-crystal-l-original-imaen6cfxddtkkrc.jpeg?q=70",
    "https://www.permanad.se/wp-content/uploads/sites/4/2017/06/pixelxl_black.jpg",
    "https://www1-lw.xda-cdn.com/files/2018/01/GooglePay_Lockup.max-1000x1000.png"};

    // private String [] imageurl=


    @Override
    public int getCount() {
        return imagess.length;
    }
    public ViewpageAdapter(Context context)
    {
        this.context=context;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layout=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view =layout.inflate(R.layout.viewpageadapter,null);
        ImageView image=view.findViewById(R.id.Images);

         Integer[] image1 = {R.drawable.collaps,R.drawable.fullstar,R.drawable.expand};
         images = image1;
       // image.setImageResource(images[position]);
        Picasso.with(context).load(imagess[position]).into(image);
        ViewPager pr=(ViewPager)container;

        pr.addView(view,0);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("ented","entry");
                Toast.makeText(context, String.valueOf(position), Toast.LENGTH_SHORT).show();
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
