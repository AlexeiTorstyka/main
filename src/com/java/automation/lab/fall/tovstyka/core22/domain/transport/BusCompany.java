package com.java.automation.lab.fall.tovstyka.core22.domain.transport;

import Enumeration.Privileges;
import interf.Counting;

import java.math.BigDecimal;

public class BusCompany implements Counting {
    private String name;
    private String location;
    private long[] busId;
    private BigDecimal price;
    private BigDecimal discount;
    private BigDecimal undervaluation;
    Bus bus;
    BusCompany(String name,String location,long[] busId,BigDecimal price,
               BigDecimal discount,BigDecimal undervaluation,Bus someBus) {
        this.name=name;
        this.location=location;
        this.busId=busId;
        this.price=price;
        this.discount=discount;
        this.undervaluation = undervaluation;
        this.bus = someBus;
    }

    @Override
    public BigDecimal count() {
        BigDecimal result;
        result = undervaluation.multiply(bus.count());
        return result;
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
    public void setLocation(String location){
        this.location = location;
    }
    public long[] getBusId() {
        return busId;
    }
    public void setBusId(long[] busId){
        this.busId = busId;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price){
        this.price = price;
    }
    public BigDecimal getDiscount() {
        return discount;
    }
    public void setDiscount(BigDecimal discount){ this.discount = discount;}
    public BigDecimal getUndervaluation() {
        return undervaluation;
    }
    public void setUndervaluation(BigDecimal undervaluation) { this.undervaluation = undervaluation; }
}
