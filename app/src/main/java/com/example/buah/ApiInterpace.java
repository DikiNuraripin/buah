package com.example.buah;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterpace {
    @GET("8587da66")
    Call<Buah>getBuah();
}
