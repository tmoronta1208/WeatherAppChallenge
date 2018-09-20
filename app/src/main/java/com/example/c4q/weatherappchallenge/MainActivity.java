package com.example.c4q.weatherappchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.c4q.weatherappchallenge.model.AerisModel;
import com.example.c4q.weatherappchallenge.model.Periods;
import com.example.c4q.weatherappchallenge.network.AerisService;
import com.example.c4q.weatherappchallenge.rv.AerisAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    AerisService aerisService;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aerisService = new AerisService();

        getWeather();

    }

    private void getWeather() {
        Call<AerisModel> photoCall = aerisService.getAerisAPI().getWeather();
        photoCall.enqueue(new Callback<AerisModel>() {
            @Override
            public void onResponse(Call<AerisModel> call, Response<AerisModel> response) {
                List<Periods> weatherResponse = response.body().getResponse().get(0).getPeriods();
                setUpRecyclerView(weatherResponse);
            }

            @Override
            public void onFailure(Call<AerisModel> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

    private void setUpRecyclerView(List<Periods> responseList) {
        recyclerView = findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AerisAdapter aerisAdapter = new AerisAdapter(responseList);
        recyclerView.setAdapter(aerisAdapter);
    }
}
