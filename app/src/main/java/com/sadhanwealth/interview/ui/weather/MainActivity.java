package com.sadhanwealth.interview.ui.weather;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sadhanwealth.interview.R;
import com.sadhanwealth.interview.RVItemClickListener;
import com.sadhanwealth.interview.ui.weatherdetails.WeatherDetailsActivity;
import com.sadhanwealth.interview.WeatherModel;
import com.sadhanwealth.interview.api.ApiClient;
import com.sadhanwealth.interview.api.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    WeatherModel model;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeVariables();


    }

    private void initializeVariables() {

        recyclerView = (RecyclerView) findViewById(R.id.rvWeather);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        progressDialog = new ProgressDialog(MainActivity.this);


        apiCall();

    }

    private void apiCall() {

        progressDialog.setMessage("Please Wait");
        progressDialog.show();

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        apiService.getWeatherForecast().enqueue(new Callback<WeatherModel>() {
            @Override
            public void onResponse(Call<WeatherModel> call, Response<WeatherModel> response) {

                progressDialog.dismiss();

                Log.i("SadhanWealth", "onResponse: " + response.body());
                model = response.body();
                WeatherAdapter adapter = new WeatherAdapter(model.getForecast().getForecastday());

                adapter.setRvItemClickListener(new RVItemClickListener<WeatherModel.Forecast.ForecastdayItem>() {
                    @Override
                    public void onItemClick(int position, WeatherModel.Forecast.ForecastdayItem data) {
                        Log.i("SadhanWealth", "onItemClick: position :- " + position + " data :- " + data);


                        Intent intent = new Intent(MainActivity.this, WeatherDetailsActivity.class);
                        intent.putExtra("data", data);
                        startActivityForResult(intent, 100);


                    }
                });


                recyclerView.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<WeatherModel> call, Throwable t) {
                progressDialog.dismiss();
                Log.i("SadhanWealth", "onFailure: " + t.getMessage());
                Toast.makeText(MainActivity.this, " " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}