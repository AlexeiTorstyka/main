package com.java.automation.lab.fall.tovstyka.core22.domain.transport;

import interf.Counting;

import java.math.BigDecimal;

public class Train extends Transport implements Counting {
    private String name;
    private String startPoint;
    private BigDecimal distance;
    private BigDecimal pricePerMile;
    private boolean check;
    private long trainId;


    @Override
    public BigDecimal count() {
        BigDecimal res = distance.multiply(pricePerMile);
        return res;
    }


    Train(String name,String startPoint,BigDecimal distance,BigDecimal pricePerMile,boolean check,long trainId){
        super(name,startPoint,distance,pricePerMile,check);
        this.trainId=trainId;

    }

    public long getTrainId(){return trainId;}
    public void setTrainId(long trainId){this.trainId = trainId;}

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

    public BigDecimal getDistance() {
        return distance;
    }
    public void setDistance(BigDecimal distance) {
        this.distance = distance;
    }

    public BigDecimal getPricePerMile() {
        return pricePerMile;
    }
    public void setPricePerMile(BigDecimal pricePerMile) {
        this.pricePerMile = pricePerMile;
    }

    public boolean getCheck() {
        return check;
    }
    public void setCheck(boolean check) {
        this.check = check;
    }
}
