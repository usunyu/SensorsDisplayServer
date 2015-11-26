package com.explorer.sensorsapp;

import android.hardware.Sensor;
import android.hardware.SensorManager;

/**
 * Created by Sun on 11/25/15.
 */
public class MagneticFieldSensor extends BaseSensorActivity {

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
        Sensor sensor = mSensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
        mSensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
    }

    public void stopSensors() {
        mSensorManager.unregisterListener(this);
    }

}
