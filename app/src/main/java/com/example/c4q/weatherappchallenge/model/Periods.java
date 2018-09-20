package com.example.c4q.weatherappchallenge.model;

import java.util.List;

public class Periods {
    private String sunsetISO;
    private int sunset;
    private String sunriseISO;
    private int sunrise;
    private boolean isDay;
    private String icon;
    private int avgTempF;
    private int avgTempC;
    private int minTempF;
    private int minTempC;
    private int maxTempF;
    private int maxTempC;
    private String dateTimeISO;
    private String validTime;
    private int timestamp;

    public String getSunsetISO() {
        return sunsetISO;
    }

    public int getSunset() {
        return sunset;
    }

    public String getSunriseISO() {
        return sunriseISO;
    }

    public int getSunrise() {
        return sunrise;
    }

    public boolean isDay() {
        return isDay;
    }

    public String getIcon() {
        return icon;
    }

    public int getAvgTempF() {
        return avgTempF;
    }

    public int getAvgTempC() {
        return avgTempC;
    }

    public int getMinTempF() {
        return minTempF;
    }

    public int getMinTempC() {
        return minTempC;
    }

    public int getMaxTempF() {
        return maxTempF;
    }

    public int getMaxTempC() {
        return maxTempC;
    }

    public String getDateTimeISO() {
        return dateTimeISO;
    }

    public String getValidTime() {
        return validTime;
    }

    public int getTimestamp() {
        return timestamp;
    }
}
