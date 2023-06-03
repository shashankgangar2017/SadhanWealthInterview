package com.sadhanwealth.interview.ui.weatherdetails;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sadhanwealth.interview.R;
import com.sadhanwealth.interview.WeatherModel;
import com.sadhanwealth.interview.ui.weather.WeatherAdapter;


public class WeatherDetailsActivity extends AppCompatActivity {

    WeatherModel.Forecast.ForecastdayItem forecastdayItem;


    AppCompatTextView maxtemp_cLabel, maxtemp_fLabel, mintemp_c, mintemp_f, avgtemp_c, avgtemp_f, maxwind_mph, maxwind_kph, totalprecip_mm, totalprecip_in, totalsnow_cm, avgvis_km,
            avgvis_miles, avghumidity, daily_will_it_rain, daily_chance_of_rain, daily_will_it_snow, daily_chance_of_snow, condition, uv, dateLabel,
            sunrise, sunset, moonrise, moonset, moon_phase, moon_illumination, is_moon_up, is_sun_up;

    RecyclerView hourDetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_details);

        Log.i("SadhanWealth", "onCreate: WeatherDetailsActivity :" + getIntent().getSerializableExtra("data"));

        forecastdayItem = (WeatherModel.Forecast.ForecastdayItem) getIntent().getSerializableExtra("data");

        initAndSetVariables();


    }

    private void initAndSetVariables() {

        dateLabel = (AppCompatTextView) findViewById(R.id.dateLabel);
        maxtemp_cLabel = (AppCompatTextView) findViewById(R.id.maxtemp_cLabel);
        maxtemp_fLabel = (AppCompatTextView) findViewById(R.id.maxtemp_fLabel);
        mintemp_c = (AppCompatTextView) findViewById(R.id.mintemp_c);
        mintemp_f = (AppCompatTextView) findViewById(R.id.mintemp_f);
        avgtemp_c = (AppCompatTextView) findViewById(R.id.avgtemp_c);
        avgtemp_f = (AppCompatTextView) findViewById(R.id.avgtemp_f);
        maxwind_mph = (AppCompatTextView) findViewById(R.id.maxwind_mph);
        maxwind_kph = (AppCompatTextView) findViewById(R.id.maxwind_kph);
        totalprecip_mm = (AppCompatTextView) findViewById(R.id.totalprecip_mm);
        totalprecip_in = (AppCompatTextView) findViewById(R.id.totalprecip_in);
        totalsnow_cm = (AppCompatTextView) findViewById(R.id.totalsnow_cm);
        avgvis_km = (AppCompatTextView) findViewById(R.id.avgvis_km);
        avgvis_miles = (AppCompatTextView) findViewById(R.id.avgvis_miles);
        avghumidity = (AppCompatTextView) findViewById(R.id.avghumidity);
        daily_will_it_rain = (AppCompatTextView) findViewById(R.id.daily_will_it_rain);
        daily_chance_of_rain = (AppCompatTextView) findViewById(R.id.daily_chance_of_rain);
        daily_will_it_snow = (AppCompatTextView) findViewById(R.id.daily_will_it_snow);
        daily_chance_of_snow = (AppCompatTextView) findViewById(R.id.daily_chance_of_snow);
        condition = (AppCompatTextView) findViewById(R.id.condition);
        uv = (AppCompatTextView) findViewById(R.id.uv);


        sunrise = (AppCompatTextView) findViewById(R.id.sunrise);
        sunset = (AppCompatTextView) findViewById(R.id.sunset);
        moonrise = (AppCompatTextView) findViewById(R.id.moonrise);
        moonset = (AppCompatTextView) findViewById(R.id.moonset);
        moon_phase = (AppCompatTextView) findViewById(R.id.moon_phase);
        moon_illumination = (AppCompatTextView) findViewById(R.id.moon_illumination);
        is_moon_up = (AppCompatTextView) findViewById(R.id.is_moon_up);
        is_sun_up = (AppCompatTextView) findViewById(R.id.is_sun_up);

        hourDetails = (RecyclerView) findViewById(R.id.hourDetails);



        maxtemp_cLabel.setText("Max Temp in Celcius :" + forecastdayItem.getDay().getMaxtempC());
        maxtemp_fLabel.setText("Max Temp in ferhanite : " + forecastdayItem.getDay().getMaxtempF());
        mintemp_c.setText("Min Temp in Celcius : " + forecastdayItem.getDay().getMintempC());
        mintemp_f.setText("Min Temp in Ferhanite : " + forecastdayItem.getDay().getMintempF());
        avgtemp_c.setText("Avg Temp in Celcius : " + forecastdayItem.getDay().getAvgtempC());
        avgtemp_f.setText("Avg Temp in Ferhanite : " + forecastdayItem.getDay().getAvgtempF());
        maxwind_mph.setText("Max Wind Speed in MPH : " + forecastdayItem.getDay().getMaxwindMph());
        maxwind_kph.setText("Max Wind Speed in KPH : " + forecastdayItem.getDay().getMaxwindKph());
        totalprecip_mm.setText("Total Precip in MM : " + forecastdayItem.getDay().getTotalprecipMm());
        totalprecip_in.setText("Total Precip in IN : " + forecastdayItem.getDay().getTotalprecipIn());
        totalsnow_cm.setText("Total Snow in CM : " + forecastdayItem.getDay().getTotalsnowCm());
        avgvis_km.setText("Avg VIS in KM : " + forecastdayItem.getDay().getAvgvisKm());
        avgvis_miles.setText("Avg VIS in Miles :" + forecastdayItem.getDay().getAvgvisMiles());
        avghumidity.setText("Avg Humidity :" + forecastdayItem.getDay().getAvghumidity());
        daily_will_it_rain.setText("Daily will it rain : " + forecastdayItem.getDay().getDailyWillItRain());
        daily_chance_of_rain.setText("Daily Chance on Rain : " + forecastdayItem.getDay().getDailyChanceOfRain());
        daily_will_it_snow.setText("Daily will it Snow : " + forecastdayItem.getDay().getDailyWillItSnow());
        daily_chance_of_snow.setText("Daily chance of Snow : " + forecastdayItem.getDay().getDailyChanceOfSnow());
        condition.setText("Condition : " + forecastdayItem.getDay().getCondition().getText());
        uv.setText("UV : " + forecastdayItem.getDay().getUv());
        dateLabel.setText("Date : " + forecastdayItem.getDate());


        sunrise.setText("Sunrise : " + forecastdayItem.getAstro().getSunrise());
        sunset.setText("Sunset : " + forecastdayItem.getAstro().getSunset());
        moonrise.setText("MoonRise : " + forecastdayItem.getAstro().getMoonrise());
        moonset.setText("MoonSet : " + forecastdayItem.getAstro().getMoonset());
        moon_phase.setText("Moon Phase : " + forecastdayItem.getAstro().getMoonPhase());
        moon_illumination.setText("Moon Illumination : " + forecastdayItem.getAstro().getMoonIllumination());
        is_moon_up.setText("Is Moon Up : " + forecastdayItem.getAstro().getIsMoonUp());
        is_sun_up.setText("Is Sun Up : " + forecastdayItem.getAstro().getIsSunUp());

        setHourRecyclerviewData();



    }

    private void setHourRecyclerviewData() {

        hourDetails.setLayoutManager(new LinearLayoutManager(this));

        HourAdapter adapter = new HourAdapter(forecastdayItem.getHour());

        hourDetails.setAdapter(adapter);


    }
}