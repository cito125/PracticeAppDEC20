package com.example.andresarango.practicetestdec20.network;

import com.example.andresarango.practicetestdec20.model.HouseListings;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by andresarango on 12/20/16.
 */

public interface HouseListingService {
    @GET("cgi-bin/class_12_20_2016.pl")
    Call<HouseListings> getHouses();
}
