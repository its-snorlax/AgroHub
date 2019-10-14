package com.example.locationtry;

import com.example.locationtry.model.ApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {
    @GET("/forecast")
    Call<ApiResponse> getReport(@Query("latitude") double latitude, @Query("longitude") double longitude, @Query("appid") String key);
}
