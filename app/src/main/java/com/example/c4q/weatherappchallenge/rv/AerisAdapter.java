package com.example.c4q.weatherappchallenge.rv;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.c4q.weatherappchallenge.R;
import com.example.c4q.weatherappchallenge.model.Periods;

import java.util.List;

public class AerisAdapter extends RecyclerView.Adapter<AerisViewHolder> {
    private List<Periods> weatherList;

    public AerisAdapter(List<Periods> weatherList) {
        this.weatherList = weatherList;
    }

    @NonNull
    @Override
    public AerisViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new AerisViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AerisViewHolder holder, int position) {
        holder.bind(weatherList.get(position));
    }

    @Override
    public int getItemCount() {
        return weatherList.size();
    }
}
