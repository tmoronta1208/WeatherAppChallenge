package com.example.c4q.weatherappchallenge.model;

import java.util.List;

public class Response {
    private Profile profile;
    private List<Periods> periods;
    private String interval;
    private Loc loc;

    public Profile getProfile() {
        return profile;
    }

    public List<Periods> getPeriods() {
        return periods;
    }

    public String getInterval() {
        return interval;
    }

    public Loc getLoc() {
        return loc;
    }
}
