package com.java.automation.lab.fall.tovstyka.core22.domain.excursions;

import com.java.automation.lab.fall.tovstyka.core22.domain.interf.Counting;

import java.math.BigDecimal;

public class ThematicExcursion extends TourProg {


    private BigDecimal rebate;


    @Override
    public BigDecimal count() {
        BigDecimal result;
        result = price.subtract(rebate);
        return result;
    }

    ThematicExcursion(String name,String location,BigDecimal price, BigDecimal rebate){
        super(name, location, price);
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
}
