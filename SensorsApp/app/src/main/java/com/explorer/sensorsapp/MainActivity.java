package com.explorer.sensorsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.explorer.sensorsapp.sensors.AccelerometerSensorActivity;
import com.explorer.sensorsapp.sensors.GravitySensorActivity;
import com.explorer.sensorsapp.sensors.GyroscopeSensorActivity;
import com.explorer.sensorsapp.sensors.LinearAccelerometerSensorActivity;
import com.explorer.sensorsapp.sensors.MagneticFieldSensorActivity;
import com.explorer.sensorsapp.sensors.RotationVectorSensorActivity;
import com.explorer.sensorsapp.sensors.UncalibratedGyroscopeSensorActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.accelerometer_sensor)).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, AccelerometerSensorActivity.class);
                        startActivity(intent);
                    }
                });
        ((Button) findViewById(R.id.gyroscope_sensor)).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, GyroscopeSensorActivity.class);
                        startActivity(intent);
                    }
                });
        ((Button) findViewById(R.id.magnetic_field_sensor)).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, MagneticFieldSensorActivity.class);
                        startActivity(intent);
                    }
                });
        ((Button) findViewById(R.id.gravity_sensor)).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, GravitySensorActivity.class);
                        startActivity(intent);
                    }
                });
        ((Button) findViewById(R.id.rotation_vector_sensor)).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, RotationVectorSensorActivity.class);
                        startActivity(intent);
                    }
                });
        ((Button) findViewById(R.id.uncalibrated_gyroscope_sensor)).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, UncalibratedGyroscopeSensorActivity.class);
                        startActivity(intent);
                    }
                });
        ((Button) findViewById(R.id.linear_accelerometer_sensor)).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, LinearAccelerometerSensorActivity.class);
                        startActivity(intent);
                    }
                });
    }
}
