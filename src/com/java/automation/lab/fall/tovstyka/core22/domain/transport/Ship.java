package com.java.automation.lab.fall.tovstyka.core22.domain.transport;

import interf.Counting;

import java.math.BigDecimal;

public class Ship implements Counting {
    private String name;
    private String startPoint;
    private BigDecimal priceADay;
    private BigDecimal days;
    private long shipId;
    private Boolean check;

    @Override
    public BigDecimal count() {
        BigDecimal res = priceADay.multiply(days);
        return res;
    }

    Ship(String name,String startPoint,BigDecimal priceADay,BigDecimal days,long shipId,Boolean check){
        this.name=name;
        this.startPoint=startPoint;
        this.priceADay=priceADay;
        this.days=days;
        this.shipId=shipId;
        this.check=check;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getStartPoint() {
        return startPoint;
    }
    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public BigDecimal getPriceADay() {
        return priceADay;
    }
    public void setPriceADay(BigDecimal priceADay) {
        this.priceADay = priceADay;
    }

    public BigDecimal getDays() {
        return days;
    }
    public void setDays(BigDecimal days) {
        this.days = days;
    }

    public boolean getCheck() {
        return check;
    }
    public void setCheck(boolean check) {
        this.check = check;
    }

    public long getShipId() {
        return shipId;
    }
    public void setShipId(long shipId) {
        this.shipId = shipId;
    }
}
