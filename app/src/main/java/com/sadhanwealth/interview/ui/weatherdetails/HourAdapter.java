package com.sadhanwealth.interview.ui.weatherdetails;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sadhanwealth.interview.R;
import com.sadhanwealth.interview.WeatherModel;

import java.util.List;

public class HourAdapter extends RecyclerView.Adapter<HourAdapter.ViewHolder> {

    List<WeatherModel.Forecast.ForecastdayItem.HourItem> hourItemList;

    public HourAdapter(List<WeatherModel.Forecast.ForecastdayItem.HourItem> hourItemList) {

        this.hourItemList = hourItemList;


    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.card_hour_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        WeatherModel.Forecast.ForecastdayItem.HourItem item = hourItemList.get(position);

        String[] arrayOfString = item.getTime().split("\\s+");

        holder.hourTimeLabel.setText("Time : " + arrayOfString[1]);
        holder.temp_c.setText("Temp in Cel : " + item.getTempC());
        holder.temp_f.setText("Temp in Fehrenite : " + item.getTempF());
        holder.condition.setText("Condition : " + item.getCondition().getText());
        holder.wind_mph.setText("Wind in MPH : " + item.getWindMph());
        holder.wind_kph.setText("Wind in KPH : " + item.getWindKph());
        holder.wind_dir.setText("Wind Direction : " + item.getWindDir());
        holder.humidity.setText("Humidity : " + item.getHumidity());

    }

    @Override
    public int getItemCount() {
        return hourItemList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView hourTimeLabel, temp_c, temp_f, condition, wind_mph, wind_kph, wind_dir, humidity;

        public ViewHolder(View itemView) {
            super(itemView);

            this.hourTimeLabel = (TextView) itemView.findViewById(R.id.hourTimeLabel);
            this.temp_c = (TextView) itemView.findViewById(R.id.temp_c);
            this.temp_f = (TextView) itemView.findViewById(R.id.temp_f);
            this.condition = (TextView) itemView.findViewById(R.id.condition);
            this.wind_mph = (TextView) itemView.findViewById(R.id.wind_mph);
            this.wind_kph = (TextView) itemView.findViewById(R.id.wind_kph);
            this.wind_dir = (TextView) itemView.findViewById(R.id.wind_dir);
            this.humidity = (TextView) itemView.findViewById(R.id.humidity);
        }
    }


}
