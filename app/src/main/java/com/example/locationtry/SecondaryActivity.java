package com.example.locationtry;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondaryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        Bundle extras = getIntent().getExtras();
        int dt;
        int humidity;
        double temp;
        String description;
        dt = extras.getInt("date");
        humidity = extras.getInt("humidity");
        temp = extras.getInt("temp");
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
