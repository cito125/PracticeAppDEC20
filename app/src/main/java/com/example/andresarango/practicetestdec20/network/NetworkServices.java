package com.example.andresarango.practicetestdec20.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by andresarango on 12/20/16.
 */

public class NetworkServices {

    public <T> T getJSONService(String base_url, Class<T> networkServiceInterface) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(networkServiceInterface);
    }
}
