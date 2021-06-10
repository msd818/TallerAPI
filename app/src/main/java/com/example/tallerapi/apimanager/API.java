package com.example.tallerapi.apimanager;

import com.example.tallerapi.models.Destilerias;
import com.example.tallerapi.models.Whishy;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface API {
    String BASE_URL = "https://whiskyhunter.net/api/";

    //END POINT

    @GET("auctions_info")
    Call<List<Whishy>> getWhishy();

    @GET("distilleries_info/")
    Call<List<Destilerias>> getdestilerias();

    @GET("auction_data/{slug}/")
    Call<Whishy> getWhisky(@Path("slug") String slug);

}
