package com.dschacktoberfest.abeshack.model;

import java.util.List;

import lombok.Getter;

public class WeatherRespones {
    @Getter
    private Coordinates coordinates;
    @Getter
    private List<Weather> weathers;
    @Getter
    private String base;
    @Getter
    private Main main;
    @Getter
    private long visibility;
    @Getter
    private Wind wind;
    @Getter
    private Cloud clouds;
    @Getter
    private int dt;
    @Getter
    private Sys sys;
    @Getter
    private int id;
    @Getter
    private String name;
    @Getter
    private int cod;

    public WeatherRespones(Coordinates coordinates, List<Weather> weathers, String base, Main main, long visibility, Wind wind, Cloud clouds, int dt, Sys sys, int id, String name, int cod) {
        this.coordinates = coordinates;
        this.weathers = weathers;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
        this.wind = wind;
        this.clouds = clouds;
        this.dt = dt;
        this.sys = sys;
        this.id = id;
        this.name = name;
        this.cod = cod;
    }
}
