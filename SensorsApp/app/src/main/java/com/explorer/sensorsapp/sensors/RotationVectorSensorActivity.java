package com.explorer.sensorsapp.sensors;

import android.hardware.Sensor;
import android.hardware.SensorManager;

/**
 * Created by Sun on 11/25/15.
 */
public class RotationVectorSensorActivity extends BaseSensorActivity {

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
        Sensor sensor = mSensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR);
        mSensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
    }

    public void stopSensors() {
        mSensorManager.unregisterListener(this);
    }

}
