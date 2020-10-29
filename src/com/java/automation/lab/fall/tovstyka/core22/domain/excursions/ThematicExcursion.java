package com.java.automation.lab.fall.tovstyka.core22.domain.excursions;

import interf.Counting;

import java.math.BigDecimal;

public class ThematicExcursion extends TourProg implements Counting {
    private String name;
    private String location;
    private BigDecimal price;
    private boolean check;
    private BigDecimal rebate;


    @Override
    public BigDecimal count() {
        BigDecimal result;
        result = price.subtract(rebate);
        return result;
    }

    ThematicExcursion(String name,String location,BigDecimal price,boolean check, BigDecimal rebate){
        super(name, location, price);
        this.check=check;
        this.rebate = rebate;
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
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public boolean getCheck() {
        return check;
    }
    public void setCheck(boolean check) {
        this.check = check;
    }
}
