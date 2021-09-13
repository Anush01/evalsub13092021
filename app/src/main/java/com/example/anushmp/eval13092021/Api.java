package com.example.anushmp.eval13092021;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {


    @GET()
    Call<ApiResponse> getMovies();



}
