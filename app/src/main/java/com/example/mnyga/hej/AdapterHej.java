package com.example.mnyga.hej;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Admin on 07.08.2017.
 */

public class AdapterHej extends RecyclerView.Adapter<AdapterHej.ViewHolder>{
    List<Hej> hejs = new ArrayList<>();
        public AdapterHej(List<Hej> hejs ) {
        this.hejs = this.hejs;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)//s04e03 1:30
    {
       View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hej, parent, false);
        AdapterHej.ViewHolder vh = new ViewHolder(inflate);
        return vh;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position)//ukazujemy wybrana notatke
    {
        Hej hej = hejs.get(position);
        holder.textViewFrom.setText("Hej from " + hej.fromUser);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(hej.timestamp);
        holder.textViewTimestamp.setText(calendar.get(Calendar.HOUR_OF_DAY)+":"+calendar.get(Calendar.MINUTE));
    }

    @Override
    public int getItemCount() {//ile leementow ma ta lista
        return hejs.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        public TextView textViewFrom;
        public TextView textViewTimestamp;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewTimestamp= (TextView) itemView.findViewById(R.id.timestamp);
            textViewFrom = (TextView) itemView.findViewById(R.id.from);
        }
    }
}
