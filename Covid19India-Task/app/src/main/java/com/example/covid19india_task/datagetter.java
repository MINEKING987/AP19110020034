package com.example.covid19india_task;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

public class datagetter extends AsyncTask<Void,Void,String> {
    String url = "https://api.covid19api.com/dayone/country/IN";
    Context ct;
    RecyclerView rv;
    ProgressDialog pd;
    public datagetter(MainActivity mainActivity, RecyclerView rv) {
        ct = mainActivity;
        this.rv = rv;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        pd = new ProgressDialog(ct);
        pd.setMessage("Please wait....");
        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        pd.show();
    }

    @Override
    protected String doInBackground(Void... voids) {
        try {
            URL u = new URL(url);
            HttpsURLConnection con = (HttpsURLConnection) u.openConnection();
            InputStream is = con.getInputStream();
            BufferedReader read = new BufferedReader(new InputStreamReader(is));
            String line = "";
            StringBuilder build = new StringBuilder();
            while((line = read.readLine())!=null){
                build.append(line);
            }
            return build.toString();
        } catch (Exception e) {
            e.printStackTrace();
//            Log.i("error", String.valueOf(e));
        }
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        pd.dismiss();
      if(s == null)
      {Toast.makeText(ct,"Internet Error",Toast.LENGTH_SHORT).show();}
        else{

            List<datablock> data = new ArrayList<>();
            try {
                JSONArray rootJ = new JSONArray(s);
                for(int i = rootJ.length()-1; i >= 0 ; i--) {
                    Log.i("deb", String.valueOf(i));
                    JSONObject datdata = rootJ.getJSONObject(i);
                    String date = datdata.getString("Date");
                    date = date.substring(0, date.indexOf('T'));
                    String active = datdata.getString("Active");
                    String recov = datdata.getString("Recovered");
                    String dead = datdata.getString("Deaths");
                    datablock temp1 = new datablock(date,active,recov,dead);
                    data.add(temp1);
                }
                    rv.setLayoutManager(new LinearLayoutManager(ct));
                    rv.setAdapter(new addapter(data,ct));
            } catch (JSONException e) {
                e.printStackTrace();
                Log.i("error", String.valueOf(e));
            }}
    }
}
