package com.java.automation.lab.fall.tovstyka.core22.domain.placeForLiving;

import interf.Counting;

import java.math.BigDecimal;

public class BuisnesHotel extends Hotel implements Counting {
    private String name;
    private String location;
    private BigDecimal duration;
    private long id;
    private BigDecimal priceADay;
    private boolean check;

    @Override
    public BigDecimal count() {
        return priceADay.multiply(duration);
    }


    BuisnesHotel(String name,String location, BigDecimal priceADay, BigDecimal duration,long id, boolean check) {
    super(name, location, priceADay, duration);
    this.id=id;
    this.check=check;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPriceADay(BigDecimal priceADay) {
        this.priceADay = priceADay;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public BigDecimal getDuration() {
        return duration;
    }

    public long getId() {
        return id;
    }

    public BigDecimal getPriceADay() {
        return priceADay;
    }

    public boolean isCheck() {
        return check;
    }
}
