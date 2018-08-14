package com.example.administrator.myapplication.lib;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.administrator.myapplication.MainActivity;
import com.example.administrator.myapplication.api.Api;
import com.example.administrator.myapplication.api.ApiService;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitManager {
    private static RetrofitManager retrofitManager;
    private static ApiService apiService;
    private SharedPreferences sharedPreferences;

    private RetrofitManager() {
    }

    public static RetrofitManager getInstance() {
        if (retrofitManager == null) {
            synchronized (RetrofitManager.class) {
                if (retrofitManager == null) {
                    retrofitManager = new RetrofitManager();
                }
            }
        }
        return retrofitManager;
    }

    public ApiService getApiService() {
        sharedPreferences = MainActivity.mContext.getSharedPreferences("user", Context.MODE_PRIVATE);
        final String token = sharedPreferences.getString("token", null);

        OkHttpClient httpClient =
                new OkHttpClient.Builder().addInterceptor(new Interceptor() {
                    @Override
                    public okhttp3.Response intercept(Chain chain) throws IOException {
                        Request original = chain.request();
                        HttpUrl originalHttpUrl = original.url();
                        HttpUrl url = originalHttpUrl.newBuilder()
                                .addQueryParameter("api_token", token)
                                .build();
                        //Request customization: add request headers
                        Request.Builder requestBuilder = original.newBuilder()
                                .url(url);

                        Request request = requestBuilder.build();
                        return chain.proceed(request);
                    }
                }).build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.API_USRL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient)
                .build();

        apiService = retrofit.create(ApiService.class);

        return apiService;
    }
}
