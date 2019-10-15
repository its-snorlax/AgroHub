package com.example.locationtry.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ApiResponse {
    @SerializedName("coord")
    private Coordinate coord;
    @SerializedName("weather")
    private ArrayList<Weather> weather = new ArrayList <> ();
    @SerializedName("base")
    private String base;
    @SerializedName("main")
    private Main main;
    @SerializedName("wind")
    private Wind wind;
    @SerializedName("clouds")
    private Clouds clouds;
    @SerializedName("dt")
    private float dt;
    @SerializedName("sys")
    private Sys sys;
    @SerializedName("timezone")
    private float timezone;
    @SerializedName("id")
    private float id;
    @SerializedName("name")
    private String name;
    @SerializedName("cod")
    private float cod;



    // Getter Methods

    public Coordinate getCoord() {
        return coord;
    }

    public String getBase() {
        return base;
    }

    public Main getMain() {
        return main;
    }

    public Wind getWind() {
        return wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public float getDt() {
        return dt;
    }

    public Sys getSys() {
        return sys;
    }

    public float getTimezone() {
        return timezone;
    }

    public float getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getCod() {
        return cod;
    }

    // Setter Methods

    public void setCoord(Coordinate coordObject) {
        this.coord = coordObject;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setMain(Main mainObject) {
        this.main = mainObject;
    }

    public void setWind(Wind windObject) {
        this.wind = windObject;
    }

    public void setClouds(Clouds cloudsObject) {
        this.clouds = cloudsObject;
    }

    public void setDt(float dt) {
        this.dt = dt;
    }

    public void setSys(Sys sysObject) {
        this.sys = sysObject;
    }

    public void setTimezone(float timezone) {
        this.timezone = timezone;
    }

    public void setId(float id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCod(float cod) {
        this.cod = cod;
    }

    public ArrayList<Weather> getWeather() {
        return weather;
    }

    public void setWeather(ArrayList<Weather> weather) {
        this.weather = weather;
    }
}
