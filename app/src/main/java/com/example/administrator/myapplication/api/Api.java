package com.example.administrator.myapplication.api;
import com.example.administrator.myapplication.bean.HomeBean;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

    //https://api.zecaifu.com/api/v2/home
    @GET("home")
    Call<HomeBean> getHomeData(@Query("page") Integer page);

    @GET("home")
    Call<HomeBean> getHomeData();
}
