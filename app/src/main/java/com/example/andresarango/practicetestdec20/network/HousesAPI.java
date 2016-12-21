package com.example.andresarango.practicetestdec20.network;

import com.example.andresarango.practicetestdec20.model.HouseListings;

import retrofit2.Call;

/**
 * Created by andresarango on 12/20/16.
 */

public class HousesAPI {
    private final String BASE_URL = "http://jsjrobotics.nyc/";
    public static HousesAPI instance;
    private final HouseListingService houseListingService;

    private HousesAPI(){
        houseListingService = new NetworkServices().getJSONService(BASE_URL,HouseListingService.class);
    }

    public static HousesAPI getInstance(){
        if(instance == null){
            instance = new HousesAPI();
        }
        return instance;
    }

    public Call<HouseListings> getHouseListings(){
        return houseListingService.getHouses();
    }

}
