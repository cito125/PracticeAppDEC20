package com.example.andresarango.practicetestdec20;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andresarango.practicetestdec20.model.HouseListings;
import com.example.andresarango.practicetestdec20.network.HousesAPI;
import com.example.andresarango.practicetestdec20.recyclerview.HousesAdapter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by andresarango on 12/20/16.
 */

public class HousesFragment extends Fragment {
    RecyclerView mRecyclerView;
    HousesAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.houses_fragment,container,false);
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.houses_recyclerview);
        mAdapter = new HousesAdapter();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        mRecyclerView.setAdapter(mAdapter);
        setAdapterList();
        return rootView;
    }

    private void setAdapterList() {
        HousesAPI.getInstance().getHouseListings().enqueue(new Callback<HouseListings>() {
            @Override
            public void onResponse(Call<HouseListings> call, Response<HouseListings> response) {
                mAdapter.setHousesList(response.body().getHouses());
            }

            @Override
            public void onFailure(Call<HouseListings> call, Throwable t) {

            }
        });
    }
}
