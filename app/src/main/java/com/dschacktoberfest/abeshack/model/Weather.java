package com.dschacktoberfest.abeshack.model;

import lombok.Getter;
import lombok.Setter;

public class Weather {
    @Getter
    @Setter
    private int id;
    @Getter
    @Setter
    private String main;
    @Getter
    @Setter
    private String description;
    @Getter
    @Setter
    private String icon;
}
