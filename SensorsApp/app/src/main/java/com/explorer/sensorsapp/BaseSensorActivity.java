package com.explorer.sensorsapp;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;

import com.explorer.sensorsapp.retrofit.SensorAPIClient;
import com.explorer.sensorsapp.retrofit.SensorAPIClient.DataRequestBody;
import com.explorer.sensorsapp.retrofit.ServiceGenerator;
import com.squareup.okhttp.Response;

import retrofit.Callback;
import retrofit.RetrofitError;

/**
 * Created by Sun on 11/25/15.
 */
public class BaseSensorActivity extends Activity implements SensorEventListener {

    protected SensorManager mSensorManager;
    private SensorAPIClient mAPIClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get instance of SensorManager so that sensors can be registered/unregistered
        mSensorManager = (SensorManager)this.getSystemService(Context.SENSOR_SERVICE);
        // Create a very simple REST adapter which points the Sensor Data API endpoint.
        mAPIClient = ServiceGenerator.createService(SensorAPIClient.class);
    }

    private String getSensorTypeString(int type) {
        String str;
        switch (type) {
            case Sensor.TYPE_ROTATION_VECTOR:
                str = "ROTATION_VECTOR";
                break;
            case Sensor.TYPE_ACCELEROMETER:
                str = "ACCELEROMETER";
                break;
            case Sensor.TYPE_GYROSCOPE:
                str = "GYROSCOPE";
                break;
            case Sensor.TYPE_GRAVITY:
                str = "GRAVITY";
                break;
            case Sensor.TYPE_MAGNETIC_FIELD:
                str = "MAGNETIC_FIELD";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        return str + " SENSOR";
    }

    private void sendPostDataRequest(SensorEvent event) {
        // build request body
        DataRequestBody requestBody = new DataRequestBody(
                getSensorTypeString(event.sensor.getType()),
                event.values
        );
        // send request
        mAPIClient.postData(
                requestBody,
                new Callback<Response>() {
                    @Override
                    public void success(Response response, retrofit.client.Response response2) {
//                            Log.d("SensorActivity", "API Success");
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        Log.d("SensorActivity", "API Failure: " + error.getMessage());
                    }
                });
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        sendPostDataRequest(event);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        Log.i("SensorActivity", "onAccuracyChanged");
    }
}
