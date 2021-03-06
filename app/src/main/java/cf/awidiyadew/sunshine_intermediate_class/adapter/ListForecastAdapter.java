package cf.awidiyadew.sunshine_intermediate_class.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import cf.awidiyadew.sunshine_intermediate_class.R;
import cf.awidiyadew.sunshine_intermediate_class.model.DummyForecast;
import cf.awidiyadew.sunshine_intermediate_class.model.ListForecast;

/**
 * Created by awidiyadew on 5/7/17.
 */

public class ListForecastAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<ListForecast> listData = new ArrayList<>();

    public ListForecastAdapter(List<ListForecast> listData) {
        this.listData = listData;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_forecast_item, parent, false);

        return new ForecastItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ForecastItemViewHolder forecastItemViewHolder = (ForecastItemViewHolder) holder;
        ListForecast data = listData.get(position);
        forecastItemViewHolder.bind(data, position);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

}
