package com.java.automation.lab.fall.tovstyka.core22.domain.transport;

import com.java.automation.lab.fall.tovstyka.core22.domain.interf.Counting;

import java.math.BigDecimal;

public class Charters {
    private String name;
    private String location;
    private long[] charterId;
    private BigDecimal price;
    private BigDecimal discount;
    private int BookTheCharter() {
        return 0;
    }
    Plane plane;
    Ship ship;


    Charters(String name, String location, long[] charterId, BigDecimal price,
             BigDecimal discount, Plane somePlane, Ship someShip){
        this.name=name;
        this.location=location;
        this.charterId=charterId;
        this.price=price;
        this.discount=discount;
        this.ship =someShip;
        this.plane = somePlane;

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
    public long[] getCharterId() {
        return charterId;
    }
    public void setCharterId(long[] charterId){
        this.charterId = charterId;
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
    public void setDiscount(BigDecimal discount){
        this.discount = discount;
    }
}