package com.chicktech.chicktechweatherappandroid;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Kat on 2/1/16.
 */
public class CurrentWeather {

    private String mIcon;

    private long mTime;

    private double mTemperature;

    private double mHumidity;

    private double mPrecipChance;

    private String mSummary;

    public CurrentWeather(JSONObject forecastJson) throws JSONException {
        JSONObject currently = forecastJson.getJSONObject("currently");

        mIcon = currently.optString("icon");
        mTime = currently.optLong("time");
        mTemperature = currently.optDouble("temperature");
        mHumidity = currently.optDouble("humidity");
        mPrecipChance = currently.optDouble("precipProbability");
        mSummary = currently.optString("summary");
    }

    public String getIcon() {
        return mIcon;
    }

    public int getIconResId() {
        int iconResId = R.drawable.clear_day;

        if (mIcon.equals("clear-day")) {
            iconResId = R.drawable.clear_day;
        } else if (mIcon.equals("clear-night")) {
            iconResId = R.drawable.clear_night;
        } else if (mIcon.equals("rain")) {
            iconResId = R.drawable.rain;
        } else if (mIcon.equals("snow")) {
            iconResId = R.drawable.snow;
        } else if (mIcon.equals("sleet")) {
            iconResId = R.drawable.sleet;
        } else if (mIcon.equals("wind")) {
            iconResId = R.drawable.wind;
        } else if (mIcon.equals("fog")) {
            iconResId = R.drawable.fog;
        } else if (mIcon.equals("cloudy")) {
            iconResId = R.drawable.cloudy;
        } else if (mIcon.equals("partly-cloudy-day")) {
            iconResId = R.drawable.partly_cloudy;
        } else if (mIcon.equals("partly-cloudy-night")) {
            iconResId = R.drawable.cloudy_night;
        }

        return iconResId;
    }

    public long getTime() {
        return mTime;
    }

    public double getTemperature() {
        return mTemperature;
    }

    public double getHumidity() {
        return mHumidity;
    }

    public double getPrecipChance() {
        return mPrecipChance;
    }

    public String getSummary() {
        return mSummary;
    }
}
