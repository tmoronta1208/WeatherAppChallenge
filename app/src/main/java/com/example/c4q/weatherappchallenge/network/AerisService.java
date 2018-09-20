package com.example.c4q.weatherappchallenge.network;

import android.support.annotation.NonNull;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AerisService {

    private static final String BASE_URL = "http://api.aerisapi.com";

    private final Retrofit retrofit;

    public AerisService() {

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @NonNull
    public AerisAPI getAerisAPI() {
        return retrofit.create(AerisAPI.class);
    }
}
