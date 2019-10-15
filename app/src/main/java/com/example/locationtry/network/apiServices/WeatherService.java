package com.example.locationtry.network.apiServices;

import com.example.locationtry.model.NewApiResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {
    @GET("/data/2.5/forecast/")
    Call<NewApiResponse> getReport(@Query("lat") double latitude, @Query("lon") double longitude, @Query("appid") String key);
}
