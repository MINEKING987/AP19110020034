package com.example.covid19india_task;

public class datablock {
    private String active,recovered,dead,date;

    public datablock(String date,String active, String recovered, String dead){
        this.active = active;
        this.recovered = recovered;
        this.dead = dead;
        this.date = date;
    }

    public String getActive() {
        return active;
    }

    public String getDate() {
        return date;
    }

    public String getDead() {
        return dead;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDead(String dead) {
        this.dead = dead;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }
}
