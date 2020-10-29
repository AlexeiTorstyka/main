package com.java.automation.lab.fall.tovstyka.core22.domain.transport;

import interf.Counting;

import java.math.BigDecimal;

public class Plane implements Counting{
    private String name;
    private String startPoint;
    private String serviceClass;
    private BigDecimal price;
    private long planeId;


    @Override
    public BigDecimal count(){
        return price;
    }

    Plane(String name,String startPoint,String serviceClass,BigDecimal price,long planeId){
        this.name=name;
        this.startPoint=startPoint;
        this.serviceClass=serviceClass;
        this.price=price;
        this.planeId=planeId;
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

    public String getServiceClass() {
        return serviceClass;
    }
    public void setServiceClass(String serviceClass) {
        this.serviceClass = serviceClass;
    }

    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) { this.price = price;}

    public long getPlaneId() {
        return planeId;
    }
    public void setPlaneId(long planeId) {this.planeId = planeId;}
}


