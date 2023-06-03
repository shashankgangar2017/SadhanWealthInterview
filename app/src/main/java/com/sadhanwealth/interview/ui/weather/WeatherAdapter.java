package com.sadhanwealth.interview.ui.weather;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sadhanwealth.interview.R;
import com.sadhanwealth.interview.RVItemClickListener;
import com.sadhanwealth.interview.WeatherModel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolder> {

    List<WeatherModel.Forecast.ForecastdayItem> forecastday;
    RVItemClickListener rvItemClickListener;

    public WeatherAdapter(List<WeatherModel.Forecast.ForecastdayItem> forecastday) {
        this.forecastday = forecastday;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.card_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        WeatherModel.Forecast.ForecastdayItem item = forecastday.get(position);
        try {
            DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
            DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");
            String inputDateStr = item.getDate();
            Date date = inputFormat.parse(inputDateStr);
            String outputDateStr = outputFormat.format(date);


            holder.idTVWeatherDate.setText(outputDateStr);
            holder.idTVMinTemp.setText("" + item.getDay().getMintempC());
            holder.idTVMaxTemp.setText("" + item.getDay().getMaxtempC());
            holder.rlData.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rvItemClickListener.onItemClick(position, forecastday.get(position));
                }
            });
        } catch (Exception e) {

        }

    }

    @Override
    public int getItemCount() {
        return forecastday.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView idTVWeatherDate, idTVMinTemp, idTVMaxTemp;
        public RelativeLayout rlData;

        public ViewHolder(View itemView) {
            super(itemView);

            this.idTVWeatherDate = (TextView) itemView.findViewById(R.id.idTVWeatherDate);
            this.idTVMinTemp = (TextView) itemView.findViewById(R.id.idTVMinTemp);
            this.idTVMaxTemp = (TextView) itemView.findViewById(R.id.idTVMaxTemp);
            this.rlData = (RelativeLayout) itemView.findViewById(R.id.rlData);
        }
    }

    public void setRvItemClickListener(RVItemClickListener<WeatherModel.Forecast.ForecastdayItem> rvItemClickListener) {
        this.rvItemClickListener = rvItemClickListener;
    }

}
