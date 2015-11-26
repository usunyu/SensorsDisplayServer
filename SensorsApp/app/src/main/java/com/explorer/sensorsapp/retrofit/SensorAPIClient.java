package com.explorer.sensorsapp.retrofit;

import com.squareup.okhttp.Response;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.POST;

/**
 * Created by Sun on 11/22/15.
 */
public interface SensorAPIClient {
    class DataRequestBody {

        private String sensorType;
        private float[] sensorValues;

        public DataRequestBody(String type, float[] values) {
            sensorType = type;
            sensorValues = values;
        }
    }

    @POST("/api/write/?format=json")
    void postData(@Body DataRequestBody rb, Callback<Response> cb);
}