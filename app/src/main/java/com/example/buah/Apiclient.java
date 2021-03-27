package com.example.buah;

import android.os.SharedMemory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Apiclient {
    private static final String BASE_URL="https://api.mocki.io/v1/";
    private static Retrofit retrofitnya;
    public static Retrofit ambilData(){
        if (retrofitnya==null){
            retrofitnya=new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofitnya;
    }
}
