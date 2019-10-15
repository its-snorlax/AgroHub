package com.example.locationtry.model;

import java.util.List;

public class ListItem {
    private Coordinate coordinate;
    private List<Weather> weathers;
    private String base;
    private Main main;
    private long visiblity;
    private Wind wind;
    private Clouds clouds;
    private int dt;
    private Sys sys;
    private int cod;

    public ListItem(Coordinate coordinate, List<Weather> weathers, String base, Main main, long visiblity, Wind wind, Clouds clouds, int dt, Sys sys, int cod) {
        this.coordinate = coordinate;
        this.weathers = weathers;
        this.base = base;
        this.main = main;
        this.visiblity = visiblity;
        this.wind = wind;
        this.clouds = clouds;
        this.dt = dt;
        this.sys = sys;
        this.cod = cod;
    }

    public Sys getSys() {
        return sys;
    }

    public int getCod() {
        return cod;
    }

    public int getDt() {
        return dt;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Wind getWind() {
        return wind;
    }

    public long getVisiblity() {
        return visiblity;
    }

    public Main getMain() {
        return main;
    }

    public String getBase() {
        return base;
    }

    public List<Weather> getWeathers() {
        return weathers;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }
}
