package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by RiCrya on 2017/12/2.
 */

public class County extends DataSupport {

    private int id;

    private String countyName;//县名字

    private String weatherId;//县天气id

    private int cityId;//县所属市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
