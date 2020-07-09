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
    String api[], nam[],ver[],rel[];
    Context ct;
    ImageView imgs;
    TextView CN,V,Ap,rele;
    public addapter(MainActivity mainActivity, String[] names, int[] imgs, String[] version, String[] apilvl, String[] release) {
        img = imgs;
        nam = names;
        rel = release;
        ver = version;
        api = apilvl;
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
        CN.setText(nam[position]);
        V.setText(ver[position]);
        Ap.setText(api[position]);
        rele.setText(rel[position]);
    }
    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return img.length;
    }

    private class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgs = itemView.findViewById(R.id.imgv);
            CN = itemView.findViewById(R.id.textv);
            V = itemView.findViewById(R.id.textvb);
            Ap = itemView.findViewById(R.id.textvc);
            rele = itemView.findViewById(R.id.textvd);
        }
    }
}
