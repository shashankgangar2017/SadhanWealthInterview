package com.sadhanwealth.interview.api;

import com.google.gson.JsonElement;
import com.sadhanwealth.interview.WeatherModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("forecast.json?key=e63e73e1982f4e7b938172652230206&q=Mumbai&days=7")
    Call<WeatherModel> getWeatherForecast();

}
