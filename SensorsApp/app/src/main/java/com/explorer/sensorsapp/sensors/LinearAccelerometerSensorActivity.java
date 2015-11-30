package com.explorer.sensorsapp.sensors;

import android.hardware.Sensor;
import android.hardware.SensorManager;

/**
 * Created by Sun on 11/29/15.
 */
public class LinearAccelerometerSensorActivity extends BaseSensorActivity {

    @Override
    protected void onResume() {
        super.onResume();
        startSensors();
    }

    @Override
    protected void onPause() {
        super.onPause();
        stopSensors();
    }

    public void startSensors() {
        Sensor sensor = mSensorManager.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION);
        mSensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
    }

    public void stopSensors() {
        mSensorManager.unregisterListener(this);
    }
}
