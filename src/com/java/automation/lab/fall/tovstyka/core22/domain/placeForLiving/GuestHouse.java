package com.java.automation.lab.fall.tovstyka.core22.domain.placeForLiving;

import interf.Counting;

import java.math.BigDecimal;

public class GuestHouse extends Hotel implements Counting {
    private String name;
    private String location;
    private BigDecimal priceADay;
    private BigDecimal duration;
    private boolean check;

    @Override
    public BigDecimal count() {
        BigDecimal res;
        res = priceADay.multiply(duration);
        return res;
    }

    GuestHouse(String name,String location,BigDecimal priceADay,BigDecimal duration,boolean check){
        super(name, location, priceADay, duration);
        this.check=check;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getPriceADay() {
        return priceADay;
    }
    public void setPriceADay(BigDecimal priceADay) {
        this.priceADay = priceADay;
    }
    public BigDecimal getDuration() {
        return duration;
    }

    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }
    public boolean getCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
}
