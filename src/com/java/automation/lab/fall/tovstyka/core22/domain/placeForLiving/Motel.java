package com.java.automation.lab.fall.tovstyka.core22.domain.placeForLiving;

import interf.Counting;

import java.math.BigDecimal;

public class Motel extends Hotel implements Counting {
    private String name;
    private String location;
    private BigDecimal priceADay;
    private BigDecimal discount;
    private BigDecimal duration;


    public BigDecimal count() {
        BigDecimal res;
        BigDecimal d;
        BigDecimal result;
        BigDecimal one = new BigDecimal("1");
        res = priceADay.multiply(duration);
        d = one.subtract(discount);
        result = res.multiply(d);
        return result;
    }



    Motel(String name,String location,BigDecimal priceADay,BigDecimal duration,BigDecimal discount){
        super(name, location, priceADay, duration);
        this.discount=discount;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public BigDecimal getPriceADay() {
        return priceADay;
    }
    public void setPriceADay(BigDecimal priceADay) {
        this.priceADay = priceADay;
    }
    public BigDecimal getDiscount() {
        return discount;
    }
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }
    public BigDecimal getDuration() {
        return duration;
    }
    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }
}
