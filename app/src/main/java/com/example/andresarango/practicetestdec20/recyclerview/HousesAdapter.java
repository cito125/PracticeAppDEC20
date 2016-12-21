package com.example.andresarango.practicetestdec20.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.andresarango.practicetestdec20.R;
import com.example.andresarango.practicetestdec20.model.HouseListings;

import java.util.ArrayList;
import java.util.List;

import static com.example.andresarango.practicetestdec20.model.HouseListings.*;

/**
 * Created by andresarango on 12/20/16.
 */

public class HousesAdapter extends RecyclerView.Adapter<HouseView> {
    List<House> mHouseList = new ArrayList<>();
    @Override
    public HouseView onCreateViewHolder(ViewGroup parent, int viewType) {
        return new HouseView(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.house_view,parent,false)
        );
    }

    @Override
    public void onBindViewHolder(HouseView holder, int position) {
        holder.bind(mHouseList.get(position));
    }

    @Override
    public int getItemCount() {
        return mHouseList.size();
    }

    public void setHousesList(List<House> houses) {
        mHouseList.clear();
        mHouseList.addAll(houses);
        notifyDataSetChanged();
    }
}
