package com.example.c4q.weatherappchallenge.network;

import com.example.c4q.weatherappchallenge.model.AerisModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AerisAPI {

    String ACCESS_ID = "FmbytX90Mm7mhiOoubkyH";
    String SECRET_KEY = "x0GW9h6QTLyXbu4Ih7KsXZZGvi5oLlBLQLah2Loo";

    @GET("/forecasts/11101?client_id=" + ACCESS_ID + "&client_secret=" + SECRET_KEY)
    Call<AerisModel> getWeather();
}
