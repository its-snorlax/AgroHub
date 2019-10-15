package com.example.locationtry.model;

import java.util.ArrayList;

public class NewApiResponse {
    private String cod;
    private float message;
    private float cnt;
    private ArrayList<ApiResponse> list = new ArrayList<>();
    private City city;


    // Getter Methods

    public String getCod() {
        return cod;
    }

    public float getMessage() {
        return message;
    }

    public float getCnt() {
        return cnt;
    }

    public City getCity() {
        return city;
    }

    // Setter Methods

    public void setCod(String cod) {
        this.cod = cod;
    }

    public void setMessage(float message) {
        this.message = message;
    }

    public void setCnt(float cnt) {
        this.cnt = cnt;
    }

    public void setCity(City cityObject) {
        this.city = cityObject;
    }

    public ArrayList<ApiResponse> getList() {
        return list;
    }

    public void setList(ArrayList<ApiResponse> list) {
        this.list = list;
    }
}
