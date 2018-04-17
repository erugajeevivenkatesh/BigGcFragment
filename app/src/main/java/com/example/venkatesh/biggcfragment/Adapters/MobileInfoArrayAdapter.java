package com.example.venkatesh.biggcfragment.Adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.venkatesh.biggcfragment.ArrayList.MobilesInfo;
import com.example.venkatesh.biggcfragment.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MobileInfoArrayAdapter extends RecyclerView.Adapter<MobileInfoArrayAdapter.ViewHolder> {
    List<MobilesInfo> mobilelist;
    public ImageView imageurl;
    public Activity getContext;
    public TextView MobileTitleText;
    public class ViewHolder  extends RecyclerView.ViewHolder{
        public TextView mmobile_title,mmobile_url,mmobile_price;

        public ViewHolder(View itemView) {
            super(itemView);
            mmobile_title= itemView.findViewById(R.id.MobileTitle);
            mmobile_price=itemView.findViewById(R.id.mobileprice);
            imageurl=itemView.findViewById(R.id.MobileImage);
        }
    }
    public MobileInfoArrayAdapter(Activity context, List<MobilesInfo> list)
    {getContext=context;
        mobilelist=list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, final int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.mobileviewinrecycler,parent,false);
        MobileTitleText=view.findViewById(R.id.MobileTitle);
        CardView cardViews=view.findViewById(R.id.cardview);

        cardViews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context=v.getContext();
//                Intent intent = new Intent(context, MobileDetails.class);
//                context.startActivity(intent);
            }
        });
        

        
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MobilesInfo mobile=mobilelist.get(position);
        holder.mmobile_title.setText(mobile.getTitle());
        holder.mmobile_price.setText(mobile.getPrice());
//        Picasso.with(this)
//                .load(mobile.getImageurl())
//                .into(imageurl);
        Picasso.with(getContext).load(mobile.getImageurl()).into(imageurl);


    }

    @Override
    public int getItemCount() {
        return mobilelist.size();
    }

}
