package cf.awidiyadew.sunshine_intermediate_class.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import cf.awidiyadew.sunshine_intermediate_class.R;
import cf.awidiyadew.sunshine_intermediate_class.model.DummyForecast;

/**
 * Created by awidiyadew on 5/7/17.
 */

public class ForecastItemViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.iv_weatherIcon) ImageView ivWeatherIcon;
    @BindView(R.id.tv_day) TextView tvDay;
    @BindView(R.id.tv_forecast) TextView tvForecast;
    @BindView(R.id.tv_minTemp) TextView tvMinTemp;
    @BindView(R.id.tv_maxTemp) TextView tvMaxTemp;

    public ForecastItemViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(DummyForecast data){
        tvDay.setText(data.getDay());
        tvForecast.setText(data.getForecast());
        tvMinTemp.setText(String.valueOf(data.getMinTemp())); // konversi int ke string
        tvMaxTemp.setText(String.valueOf(data.getMaxTemp())); // konversi int ke string
    }

}