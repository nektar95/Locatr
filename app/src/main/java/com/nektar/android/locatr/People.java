package com.nektar.android.locatr;

import java.util.Date;

/**
 * Created by Patryk on 11/07/2016.
 */
public class People {
    private String mPlace;
    private Date mDate;
    private String mResult;
    private double mDistance;
    private String mName;
    private String mYear;
    private int mType;
    private String mMedal; // Typ sie zmieni w zaleznosci jak to w api jest pokazane, jutro dopracuje
    private String mEventUrl;
    private String mResultUrl;

    public String getEventUrl() {
        return mEventUrl;
    }

    public void setEventUrl(String eventUrl) {
        mEventUrl = eventUrl;
    }

    public String getResultUrl() {
        return mResultUrl;
    }

    public void setResultUrl(String resultUrl) {
        mResultUrl = resultUrl;
    }
    //not necessary???

    public People(String medal, String place, Date date, String result, double distance, String name, String year, int type) {
        mMedal = medal;
        mPlace = place;
        mDate = date;
        mResult = result;
        mDistance = distance;
        mName = name;
        mYear = year;
        mType = type;
    }

    public People()
    {

    }

    public String getPlace() {
        return mPlace;
    }

    public void setPlace(String place) {
        mPlace = place;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public String getResult() {
        return mResult;
    }

    public void setResult(String result) {
        mResult = result;
    }

    public double getDistance() {
        return mDistance;
    }

    public void setDistance(double distance) {
        mDistance = distance;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getYear() {
        return mYear;
    }

    public void setYear(String year) {
        mYear = year;
    }

    public int getType() {
        return mType;
    }

    public void setType(int type) {
        mType = type;
    }

    public String getMedal() {
        return mMedal;
    }

    public void setMedal(String medal) {
        mMedal = medal;
    }
}
