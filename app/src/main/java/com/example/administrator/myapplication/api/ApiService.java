package com.example.administrator.myapplication.api;

import com.example.administrator.myapplication.bean.BaseBean;
import com.example.administrator.myapplication.bean.ClubCategory;
import com.example.administrator.myapplication.bean.ClubListBean;
import com.example.administrator.myapplication.bean.HomeBean;
import com.example.administrator.myapplication.bean.SchoolBean;
import com.example.administrator.myapplication.bean.SchoolListBean;
import com.example.administrator.myapplication.bean.SchoolNewsListBean;
import com.example.administrator.myapplication.bean.UploadBean;
import com.example.administrator.myapplication.bean.UserBean;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

public interface ApiService {

    //https://api.zecaifu.com/api/v2/home
    @GET("home")
    Call<HomeBean> getHomeData(@Query("page") Integer page);

    @GET("home")
    Call<HomeBean> getHomeData();

    @GET("school/index")
    Call<SchoolListBean> getSchoolList();

    @GET("school/index")
    Call<SchoolListBean> getSchoolList(@Query("page") Integer page);

    @GET("club/index")
    Call<ClubListBean> getClubList(@Query("page") Integer page);

    @Multipart
    @POST("upload")
    Call<UploadBean> upload(@Part("description") RequestBody description,
                            @Part MultipartBody.Part file);

    @Multipart
    @POST("profile/user/updateAvatar")
    Call<UploadBean> updateAvatar(@Part("description") RequestBody description,
                                  @Part MultipartBody.Part file);

    @POST("login")
    Call<UserBean> login(@Query("name") String name, @Query("password") String password);

    @GET("profile/user")
    Call<UserBean> getUserInfo();

    @GET("club/category")
    Call<ClubCategory> getClubCategory();

    @Multipart
    @POST("profile/club/create")
    Call<UploadBean> createClub(@Part("description") RequestBody description, @Part MultipartBody.Part file, @Query("name") String name, @Query("category") String category, @Query("clubDescription") String desc);

    @POST("profile/school/attention")
    Call<BaseBean> payAttentionToSchool(@Query("schoolId") int SchoolId);

    @GET("school/detail")
    Call<SchoolBean> getSchoolDetail(@Query("schoolId") int schoolId);

    @GET("school/news")
    Call<SchoolNewsListBean> getSchoolNewsList(@Query("page") int page);

    @POST("profile/school/signIn")
    Call<BaseBean> signIn(@Query("schoolId") int schoolId);
    @POST("register")
    Call<BaseBean> register(@Query("name") String name, @Query("password") String password, @Query("gender") int gender);
}
