package com.example.nicolo.json;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


/**
 * Created by per6 on 1/12/18.
 */

public interface DataMuseAPI {
    String baseUrl="https://api.datamuse.com/";

    @GET("words")
    Call<List<Word>> getSoundsLike(@Query("sl") String word);
}
