package com.explorer.sensorsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
                        Intent intent = new Intent(MainActivity.this, MagneticFieldSensor.class);
                        startActivity(intent);
                    }
                });
        ((Button) findViewById(R.id.gravity_sensor)).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, GravitySensor.class);
                        startActivity(intent);
                    }
                });
        ((Button) findViewById(R.id.rotation_vector_sensor)).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, RotationVectorSensor.class);
                        startActivity(intent);
                    }
                });
    }
}
