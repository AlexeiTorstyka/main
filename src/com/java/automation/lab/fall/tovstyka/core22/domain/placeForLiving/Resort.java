package com.java.automation.lab.fall.tovstyka.core22.domain.placeForLiving;

import interf.Counting;

import java.math.BigDecimal;

public class Resort extends Hotel implements Counting {
    private String name;
    private String location;
    private BigDecimal priceADay;
    private BigDecimal duration;
    private String distanceToSea;
    @Override
    public BigDecimal count() {
        BigDecimal res = priceADay.multiply(duration);
        return res;
    }
    Resort(String name,String location,BigDecimal priceADay,BigDecimal duration,String distanceToSea){
        super(name, location, priceADay, duration);
        this.distanceToSea=distanceToSea;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;

    }public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public BigDecimal getPriceADay() {
        return priceADay;
    }
    public void setPriceADay(BigDecimal price) {
        this.priceADay = priceADay;
    }
    public BigDecimal getDuration() {
        return duration;
    }
    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    public String getDistanceToSea() {
        return distanceToSea;
    }

    public void setDistanceToSea(String distanceToSea) {
        this.distanceToSea = distanceToSea;
    }
}
