package com.example.covid19india_task;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class addapter extends RecyclerView.Adapter<addapter.AViewHolder> {
    List<datablock> data;
    Context ct;
    public addapter(List<datablock> dataf, Context ct) {
        data = dataf;
        this.ct = ct;
    }

    @NonNull
    @Override
    public addapter.AViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(ct).inflate(R.layout.datablocklayout,parent,false);
        return new AViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull addapter.AViewHolder holder, int position) {
        datablock dat = data.get(position);
        holder.date.setText(dat.getDate());
        holder.active.setText(dat.getActive());
        holder.recovered.setText(dat.getRecovered());
        holder.dead.setText(dat.getDead());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class AViewHolder extends RecyclerView.ViewHolder {
        TextView date,active,dead,recovered;
        public AViewHolder(@NonNull View itemView) {
            super(itemView);
            date = itemView.findViewById(R.id.date);
            dead = itemView.findViewById(R.id.deathval);
            active = itemView.findViewById(R.id.activeval);
            recovered = itemView.findViewById(R.id.recoveredval);
        }
    }
}
