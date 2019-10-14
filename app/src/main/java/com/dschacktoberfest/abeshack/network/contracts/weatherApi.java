package com.dschacktoberfest.abeshack.network.contracts;

import com.dschacktoberfest.abeshack.model.WeatherRespones;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface weatherApi {
    @GET("weather")
    Observable<WeatherRespones> getWeatherByLatLong(@Query("lat") String lat,
                                                    @Query("long") String lng,
                                                    @Query("appid") String appId,
                                                    @Query("units") String unit);

}
