package com.example.talky;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface RetrofitAPI {
    @GET
    Call<MessageModal> getMessage(@Url String url);
}
