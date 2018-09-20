package com.example.c4q.weatherappchallenge.rv;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.c4q.weatherappchallenge.R;
import com.example.c4q.weatherappchallenge.model.Periods;

import java.lang.reflect.Field;

public class AerisViewHolder extends RecyclerView.ViewHolder{
    private Context context;
    private TextView date;
    private ImageView icon;
    private TextView highTemp;
    private TextView lowTemp;
    private Button button;

    public AerisViewHolder(View itemView) {
        super(itemView);

        context = itemView.getContext();

        button = itemView.findViewById(R.id.toggle_button);

        date = itemView.findViewById(R.id.date);
        icon = itemView.findViewById(R.id.icon);
        highTemp = itemView.findViewById(R.id.high_temp);
        lowTemp = itemView.findViewById(R.id.low_temp);
    }

    public void bind(Periods periods){

        date.setText(periods.getDateTimeISO());
        highTemp.setText("High: " + periods.getMaxTempF() + "°F");
        lowTemp.setText("Low: " + periods.getMinTempF() + "°F");

        icon.setImageDrawable(getDrawable(periods));

    }

    @SuppressLint("NewApi")
    private Drawable getDrawable(Periods periods) {
        Resources resources = context.getResources();
        String url = "@drawable/" + periods.getIcon();
        url = url.replace(".png", "");
        int imageResource = resources.getIdentifier(url, null, context.getPackageName());
        return context.getResources().getDrawable(imageResource, null);
    }

}
