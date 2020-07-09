package com.example.recyclerview_task;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class addapter extends RecyclerView.Adapter {
    int img[];
    String nam[];
    Context ct;
    ImageView imgs;
    TextView txt;
    public addapter(MainActivity mainActivity, String[] names, int[] imgs) {
        img = imgs;
        nam = names;
        ct = mainActivity;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ct);
        View v = inflater.inflate(R.layout.item_layout,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        imgs.setImageResource(img[position]);
        txt.setText(nam[position]);
    }

    @Override
    public int getItemCount() {
        return img.length;
    }
    @Override
    public int getItemViewType(int position) {
        return position;
    }

    private class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgs = itemView.findViewById(R.id.imgv);
            txt = itemView.findViewById(R.id.textv);
        }
    }
}
