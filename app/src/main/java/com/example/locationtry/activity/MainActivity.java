package com.example.locationtry.activity;

import android.Manifest;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.provider.Settings;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.example.locationtry.R;
import com.example.locationtry.model.NewApiResponse;
import com.example.locationtry.network.ServiceBuilder;
import com.example.locationtry.network.apiServices.WeatherService;
import com.example.locationtry.model.ApiResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private static final int REQUEST_LOCATION = 1;
    Button getlocationBtn;
    TextView showLocationTxt;

    LocationManager locationManager;
    String latitude, longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add permission

        ActivityCompat.requestPermissions(this, new String[]
                {Manifest.permission.ACCESS_FINE_LOCATION}, REQUEST_LOCATION);

        showLocationTxt = findViewById(R.id.show_location);
        getlocationBtn = findViewById(R.id.getLocation);

        getlocationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

                //Check gps is enable or not

                if (!locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
                    //Write Function To enable gps

                    OnGPS();
                } else {
                    //GPS is already On then

                    getLocation();
                }
            }
        });
        Spinner spinner = findViewById(R.id.Crops);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Crops, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }

    private void getLocation() {

        //Check Permissions again

        if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(MainActivity.this,

                Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]
                    {Manifest.permission.ACCESS_FINE_LOCATION}, REQUEST_LOCATION);
        } else {
            Location LocationGps = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
            Location LocationNetwork = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
            Location LocationPassive = locationManager.getLastKnownLocation(LocationManager.PASSIVE_PROVIDER);

            if (LocationGps != null) {
                double lat = LocationGps.getLatitude();
                double longi = LocationGps.getLongitude();

                latitude = String.valueOf(lat);
                longitude = String.valueOf(longi);

                makeApiCall(lat, longi);

                showLocationTxt.setText("Your Location:" + "\n" + "Latitude= " + latitude + "\n" + "Longitude= " + longitude);
            } else if (LocationNetwork != null) {
                double lat = LocationNetwork.getLatitude();
                double longi = LocationNetwork.getLongitude();

                latitude = String.valueOf(lat);
                longitude = String.valueOf(longi);

                makeApiCall(lat, longi);

                showLocationTxt.setText("Your Location:" + "\n" + "Latitude= " + latitude + "\n" + "Longitude= " + longitude);
            } else if (LocationPassive != null) {
                double lat = LocationPassive.getLatitude();
                double longi = LocationPassive.getLongitude();

                latitude = String.valueOf(lat);
                longitude = String.valueOf(longi);

                makeApiCall(lat, longi);

                showLocationTxt.setText("Your Location:" + "\n" + "Latitude= " + latitude + "\n" + "Longitude= " + longitude);
            } else {
                Toast.makeText(this, "Can't Get Your Location", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private void makeApiCall(double lat, double longi) {
        WeatherService weatherService = ServiceBuilder.build(WeatherService.class);
        String key = "1e8341a66f4cfc9aa9c3b84cc6b9a295";
        Log.e("request", "send");
        weatherService.getReport(lat, longi, key).enqueue(new Callback<NewApiResponse>() {
            @Override
            public void onResponse(Call<NewApiResponse> call, Response<NewApiResponse> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(MainActivity.this, "Sucess", Toast.LENGTH_SHORT).show();
                    NewApiResponse responseBody = response.body();
                    openDetailActivity(responseBody);
                } else if (response.code() == 401) {
                    Toast.makeText(MainActivity.this, "UnAuth", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "not sucessful", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call NewApiResponse, Throwable t) {
                Toast.makeText(MainActivity.this, "network call fail", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void openDetailActivity(NewApiResponse responseBody) {
        ApiResponse apiResponse = responseBody.getList().get(1);
        ApiResponse apiResponse2 = responseBody.getList().get(10);
        ApiResponse apiResponse3 = responseBody.getList().get(18);
        ApiResponse apiResponse4 = responseBody.getList().get(26);
        ApiResponse apiResponse5 = responseBody.getList().get(34);

        float dt2 = apiResponse2.getDt();
        float humidity2 = apiResponse2.getMain().getHumidity();
        double temp2 = apiResponse2.getMain().getTemp();
        String description2 = apiResponse2.getWeather().get(0).getDescription();
        String dt_text2 = apiResponse2.getDt_text();

        float dt3 = apiResponse3.getDt();
        float humidity3 = apiResponse3.getMain().getHumidity();
        double temp3 = apiResponse3.getMain().getTemp();
        String description3 = apiResponse3.getWeather().get(0).getDescription();
        String dt_text3 = apiResponse3.getDt_text();

        float dt4 = apiResponse4.getDt();
        float humidity4 = apiResponse4.getMain().getHumidity();
        double temp4 = apiResponse4.getMain().getTemp();
        String description4 = apiResponse4.getWeather().get(0).getDescription();
        String dt_text4 = apiResponse4.getDt_text();

        float dt5 = apiResponse.getDt();
        float humidity5 = apiResponse.getMain().getHumidity();
        double temp5 = apiResponse.getMain().getTemp();
        String description5 = apiResponse.getWeather().get(0).getDescription();
        String dt_text5 = apiResponse.getDt_text();

        float dt = apiResponse.getDt();
        float humidity = apiResponse.getMain().getHumidity();
        double temp = apiResponse.getMain().getTemp();
        String description = apiResponse.getWeather().get(0).getDescription();
        String dt_text = apiResponse.getDt_text();

        Intent secondaryActivityIntent = new Intent(MainActivity.this, WeatherActivity.class);
        secondaryActivityIntent.putExtra("date", dt);
        secondaryActivityIntent.putExtra("humidity", humidity);
        secondaryActivityIntent.putExtra("temp", temp);
        secondaryActivityIntent.putExtra("description", description);
        secondaryActivityIntent.putExtra("dateText",dt_text);

        secondaryActivityIntent.putExtra("date2", dt2);
        secondaryActivityIntent.putExtra("humidity2", humidity2);
        secondaryActivityIntent.putExtra("temp2", temp2);
        secondaryActivityIntent.putExtra("description2", description2);
        secondaryActivityIntent.putExtra("dateText2",dt_text2);

        secondaryActivityIntent.putExtra("date3", dt3);
        secondaryActivityIntent.putExtra("humidity3", humidity3);
        secondaryActivityIntent.putExtra("temp3", temp3);
        secondaryActivityIntent.putExtra("description3", description3);
        secondaryActivityIntent.putExtra("dateText3",dt_text3);

        secondaryActivityIntent.putExtra("date4", dt4);
        secondaryActivityIntent.putExtra("humidity4", humidity4);
        secondaryActivityIntent.putExtra("temp4", temp4);
        secondaryActivityIntent.putExtra("description4", description4);
        secondaryActivityIntent.putExtra("dateText4",dt_text4);

        secondaryActivityIntent.putExtra("date5", dt5);
        secondaryActivityIntent.putExtra("humidity5", humidity5);
        secondaryActivityIntent.putExtra("temp5", temp5);
        secondaryActivityIntent.putExtra("description5", description5);
        secondaryActivityIntent.putExtra("dateText5",dt_text5);
        startActivity(secondaryActivityIntent);
    }

    private void OnGPS() {

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage("Enable GPS").setCancelable(false).setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS));
            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.cancel();
            }
        });
        final AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(), text, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
