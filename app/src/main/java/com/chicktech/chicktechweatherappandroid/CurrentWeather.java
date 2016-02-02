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

}
