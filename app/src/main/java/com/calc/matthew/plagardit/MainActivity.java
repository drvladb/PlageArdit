package com.calc.matthew.plagardit;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import android.view.View;

public class MainActivity extends AppCompatActivity {
    public Disease disease = new Disease(1, 0);
    public ArrayList<Country> countries = new ArrayList<Country>();

    Timer timer;
    TimerTask timerTask;
    final Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countries.add(new Country("Arditopia", 1, 1, 500000, 0));
        countries.add(new Country("Arditland", 30, 30, 250000, 0));
        countries.add(new Country("Runescape", 50, 10, 125000, 0));
        countries.add(new Country("DarkwolfLand", 100, 100, 1000, 0));
    }

    protected void onResume() {
        super.onResume();
        startTimer();
    }

    public void startTimer() {
        //set a new Timer
        timer = new Timer();

        //initialize the TimerTask's job
        initializeTimerTask();

        //schedule the timer, after the first 5000ms the TimerTask will run every 10000ms
        timer.schedule(timerTask, 5000, 10000); //
    }

    public void stoptimertask(View v) {
        //stop the timer, if it's not already null
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
    }

    public void initializeTimerTask() {

        timerTask = new TimerTask() {
            public void run() {

                //use a handler to run a toast that shows the current timestamp
                handler.post(new Runnable() {
                    public void run() {

                    }
                });
            }
        };
    }

    public void arditopiaClicked(View view)
    {
        countries.get(0).addInfected(1);
    }

    public void arditlandClicked(View view)
    {
        countries.get(1).addInfected(1);
    }

    public void runescapeClicked(View view)
    {
        countries.get(2).addInfected(1);
    }

    public void darkwolflandClicked(View view)
    {
        countries.get(3).addInfected(1);
    }

    public int spread(Country country)
    {
        return disease.getSpreadLevel() * country.getInfectedPopulation() - country.getSocialLevel() + country.getTransportationLevel();
    }

}
