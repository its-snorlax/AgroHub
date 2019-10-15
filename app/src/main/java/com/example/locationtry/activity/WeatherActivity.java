package com.example.locationtry.activity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.locationtry.R;
import com.example.locationtry.network.apiServices.WeatherService;

public class WeatherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        TextView alert = findViewById(R.id.alertMessage);

        Bundle extras = getIntent().getExtras();
        float dt = extras.getFloat("date");
        float humidity = extras.getFloat("humidity");
        double temp = extras.getDouble("temp");
        String description = extras.getString("description");
        String dateText = extras.getString("dateText");

        float dt2 = extras.getFloat("date2");
        float humidity2 = extras.getFloat("humidity2");
        double temp2 = extras.getDouble("temp2");
        String description2 = extras.getString("description2");
        String dateText2 = extras.getString("dateText2");

        float dt3 = extras.getFloat("date3");
        float humidity3 = extras.getFloat("humidity3");
        double temp3 = extras.getDouble("temp3");
        String description3 = extras.getString("description3");
        String dateText3 = extras.getString("dateText3");

        float dt4 = extras.getFloat("date4");
        float humidity4 = extras.getFloat("humidity4");
        double temp4 = extras.getDouble("temp4");
        String description4 = extras.getString("description4");
        String dateText4 = extras.getString("dateText4");

        float dt5 = extras.getFloat("date5");
        float humidity5 = extras.getFloat("humidity5");
        double temp5 = extras.getDouble("temp5");
        String description5 = extras.getString("description5");
        String dateText5 = extras.getString("dateText5");

        TextView dateView = findViewById(R.id.date);
        TextView humidityTextView = findViewById(R.id.humidity);
        TextView tempTextView = findViewById(R.id.temp);
        TextView descriptionTextView = findViewById(R.id.description);
        TextView dateTextView = findViewById(R.id.date_text);

        TextView dateView2 = findViewById(R.id.date2);
        TextView humidityTextView2 = findViewById(R.id.humidity2);
        TextView tempTextView2 = findViewById(R.id.temp2);
        TextView descriptionTextView2 = findViewById(R.id.description2);
        TextView dateTextView2 = findViewById(R.id.date_text2);

        TextView dateView3 = findViewById(R.id.date3);
        TextView humidityTextView3 = findViewById(R.id.humidity3);
        TextView tempTextView3 = findViewById(R.id.temp3);
        TextView descriptionTextView3 = findViewById(R.id.description3);
        TextView dateTextView3 = findViewById(R.id.date_text3);

        TextView dateView4 = findViewById(R.id.date4);
        TextView humidityTextView4 = findViewById(R.id.humidity4);
        TextView tempTextView4 = findViewById(R.id.temp4);
        TextView descriptionTextView4 = findViewById(R.id.description4);
        TextView dateTextView4 = findViewById(R.id.date_text4);

        TextView dateView5 = findViewById(R.id.date5);
        TextView humidityTextView5 = findViewById(R.id.humidity5);
        TextView tempTextView5 = findViewById(R.id.temp5);
        TextView descriptionTextView5 = findViewById(R.id.description5);
        TextView dateTextView5 = findViewById(R.id.date_text5);


        dateView.setText(dt + "");
        humidityTextView.setText(humidity + "");
        tempTextView.setText(temp + "");
        descriptionTextView.setText(description);
        dateTextView.setText(dateText);

        dateView2.setText(dt2 + "");
        humidityTextView2.setText(humidity2 + "");
        tempTextView2.setText(temp2 + "");
        descriptionTextView2.setText(description2);
        dateTextView2.setText(dateText2);

        dateView3.setText(dt3 + "");
        humidityTextView3.setText(humidity3 + "");
        tempTextView3.setText(temp3 + "");
        descriptionTextView3.setText(description3);
        dateTextView3.setText(dateText3);

        dateView4.setText(dt4 + "");
        humidityTextView4.setText(humidity4 + "");
        tempTextView4.setText(temp4 + "");
        descriptionTextView4.setText(description4);
        dateTextView4.setText(dateText4);

        dateView5.setText(dt5 + "");
        humidityTextView5.setText(humidity5 + "");
        tempTextView5.setText(temp5 + "");
        descriptionTextView5.setText(description5);
        dateTextView5.setText(dateText5);

        if (description.contains("clear")
                && description2.contains("clear")
                && description3.contains("clear")
                && description4.contains("clear")
                && description5.contains("clear")) {
            alert.setText("Weather is clear, No Worries");
        }

        if (description.contains("heavy intensity rain")) {
            alert.setText("Heavy Rain fall on " + dateText + ", Please take preventive measures");
        }

        if (description2.contains("heavy intensity rain")) {
            alert.setText("Heavy Rain fall on " + dateText2 + ", Please take preventive measures");
        }
        if (description3.contains("heavy instensity rain")) {
            alert.setText("Heavy Rain fall on " + dateText3 + ", Please take preventive measures");
        }
        if (description4.contains("heavy intensity rain")) {
            alert.setText("Heavy Rain fall on " + dateText4 + ", Please take preventive measures");
        }
        if (description5.contains("heavy Intensity rain")) {
            alert.setText("Heavy Rain fall on " + dateText + ", Please take preventive measures");
        }
    }
}
