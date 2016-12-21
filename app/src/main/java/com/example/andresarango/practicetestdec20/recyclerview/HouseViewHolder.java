package com.example.andresarango.practicetestdec20.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.andresarango.practicetestdec20.R;
import com.example.andresarango.practicetestdec20.model.HouseListings;

import static com.example.andresarango.practicetestdec20.model.HouseListings.*;

/**
 * Created by andresarango on 12/20/16.
 */
public class HouseViewHolder extends RecyclerView.ViewHolder{
    private TextView mPriceTV;
    private TextView mStyleTV;
    private TextView mLocationTV;
    public HouseViewHolder(View itemView) {
        super(itemView);
        mPriceTV = (TextView) itemView.findViewById(R.id.tv_house_price);
        mStyleTV = (TextView) itemView.findViewById(R.id.tv_house_style);
        mLocationTV = (TextView) itemView.findViewById(R.id.tv_house_location);
    }

    public void bind(House house) {
        mPriceTV.setText(house.getPrice());
        mStyleTV.setText(house.getStyle());
        mLocationTV.setText(house.getLocation());
    }
}
