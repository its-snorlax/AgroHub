package com.example.locationtry.network.apiServices;

import com.example.locationtry.model.ApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {
    @GET("/data/2.5/weather/")
    Call<ApiResponse> getReport(@Query("lat") double latitude, @Query("lon") double longitude, @Query("appid") String key);
}
