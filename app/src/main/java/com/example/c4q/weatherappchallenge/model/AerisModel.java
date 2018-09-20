package com.example.c4q.weatherappchallenge.model;

import java.util.List;

public class AerisModel {
    private List<Response> response;
    private boolean success;

    public List<Response> getResponse() {
        return response;
    }

    public boolean isSuccess() {
        return success;
    }
}
