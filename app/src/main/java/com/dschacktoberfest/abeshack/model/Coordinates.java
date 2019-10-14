package com.dschacktoberfest.abeshack.model;

import lombok.Getter;
import lombok.Setter;

public class Coordinates {
    @Getter
    @Setter
    private double lng;
    @Getter
    @Setter
    private double lat;

    @Override
    public String toString(){
        return new StringBuilder("[").append(this.lat).append(",").append(this.lng).append("]").toString();
    }
}

