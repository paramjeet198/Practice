package com.example.practice.api;

import com.example.practice.MyModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/search")
    Call<List<MyModel>> getData();


}
