package com.java.automation.lab.fall.tovstyka.core22.domain.excursions;

import interf.Counting;

import java.math.BigDecimal;

public class SightseeingExcursion extends TourProg implements Counting {
    private String name;
    private BigDecimal price;
    private String location;
    private boolean check;

    @Override
    public BigDecimal count() {
        return price;
    }

    SightseeingExcursion(String name, String location, BigDecimal price, boolean check){
        super(name, location, price);
        this.check=check;
    }

    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public boolean getCheck() {
        return check;
    }
    public void setCheck(boolean check) {
        this.check = check;
    }
}
