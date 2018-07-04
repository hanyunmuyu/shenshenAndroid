package com.example.administrator.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ResponseInterface {
    @GET("home")
    Call<ResponseString> getCall();
}
