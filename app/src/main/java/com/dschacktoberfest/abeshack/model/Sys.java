package com.dschacktoberfest.abeshack.model;

import lombok.Getter;
import lombok.Setter;

public class Sys {
    @Getter
    @Setter
    private int type;
    @Getter
    @Setter
    private int id;
    @Getter
    @Setter
    private double message;
    @Getter
    @Setter
    private String country;
    @Getter
    @Setter
    private int sunrise;
    @Getter
    @Setter
    private int sunset;
}
