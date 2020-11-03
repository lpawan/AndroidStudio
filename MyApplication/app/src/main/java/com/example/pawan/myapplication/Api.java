package com.example.pawan.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by pawan on 23/3/18.
 */

public interface Api {
    String BASE_URL="http://simplifiedcoding.net/demos/";
    @GET("marvel")
    Call<List<Hero>> getHeros();
}
