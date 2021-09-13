package com.example.anushmp.eval13092021;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitWorker {

    String baseurl = "https://gist.githubusercontent.com/Dcosta2205/cd3bf4cfdf6911fb26ae95672adb468e/raw/62d68fac146598cdba379317011ac9aa1aca8621/movies_db";

    public Retrofit getRetrofit(){

        GsonConverterFactory gf = GsonConverterFactory.create();
        OkHttpClient.Builder htb = new OkHttpClient.Builder();

        OkHttpClient htc = htb.build();

        Retrofit.Builder rfbuilder = new Retrofit.Builder();

        rfbuilder.baseUrl(baseurl);

        rfbuilder.addConverterFactory(gf);

        rfbuilder.client(htc);

        Retrofit response = rfbuilder.build();

        return response;



    }

}
