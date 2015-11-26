package com.explorer.sensorsapp.retrofit;

import com.squareup.okhttp.OkHttpClient;

import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by Sun on 11/22/15.
 */
public class ServiceGenerator {
    public static final String API_BASE_URL = "https://sensors-display-server.herokuapp.com";
//    public static final String API_BASE_URL = "http://10.0.0.20:3000";

    private static RestAdapter.Builder builder = new RestAdapter.Builder()
            .setEndpoint(API_BASE_URL)
            .setClient(new OkClient(new OkHttpClient()));

    public static <S> S createService(Class<S> serviceClass) {
        RestAdapter adapter = builder.build();
        return adapter.create(serviceClass);
    }
}
