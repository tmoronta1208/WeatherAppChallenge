package com.example.c4q.weatherappchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.c4q.weatherappchallenge.model.AerisModel;
import com.example.c4q.weatherappchallenge.network.AerisService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    AerisService aerisService;


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
                Log.d("OnSuccess", response.body().getResponse().get(0).getInterval());
//                if(response != null){
//                    List<Photo> responsePhotoList = response.body().getPhotos().getPhoto();
//                    setUpRecyclerView(responsePhotoList);
//                } else {
//                    Snackbar snackbar = Snackbar.make(
//                            getView(), R.string.error_message, Snackbar.LENGTH_SHORT);
//                    snackbar.show();
//                }
            }
            @Override
            public void onFailure(Call<AerisModel> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
