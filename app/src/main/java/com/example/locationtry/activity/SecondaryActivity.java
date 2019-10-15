package com.example.locationtry.activity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.locationtry.R;

public class SecondaryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        Bundle extras = getIntent().getExtras();
        float dt;
        float humidity;
        double temp;
        String description;
        dt = extras.getFloat("date");
        humidity = extras.getFloat("humidity");
        temp = extras.getDouble("temp");
        description = extras.getString("description");

        TextView dateTextView =  findViewById(R.id.date);
        TextView humidityTextView =  findViewById(R.id.humidity);
        TextView tempTextView =  findViewById(R.id.temp);
        TextView descriptionTextView =  findViewById(R.id.description);

        dateTextView.setText(dt+"");
        humidityTextView.setText(humidity + "");
        tempTextView.setText(temp + "");
        descriptionTextView.setText(description);

    }
}
