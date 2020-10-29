package com.java.automation.lab.fall.tovstyka.core22.domain.transport;

import interf.Counting;
import com.java.automation.lab.fall.tovstyka.core22.domain.Stages;

import java.math.BigDecimal;

public class Bus implements Counting {
    private String name;
    private String startPoint;
    private BigDecimal distance;
    private BigDecimal pricePerMile;
    private BigDecimal discount;
    private boolean check;
    private long busId;

    @Override
    public BigDecimal count() {
        BigDecimal one = new BigDecimal("1");
        BigDecimal r = distance.multiply(pricePerMile);
        BigDecimal q = one.subtract(discount);
        BigDecimal res = r.multiply(q);
        return res;
    }

    Bus(String name, String startPoint, BigDecimal distance,
        BigDecimal pricePerMile, BigDecimal discount, boolean check, long busId) {

        this.name = name;
        this.startPoint = startPoint;
        this.distance = distance;
        this.pricePerMile = pricePerMile;
        this.discount = discount;
        this.check = check;
        this.busId = busId;
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

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public boolean getCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public long getBusId() {
        return busId;
    }

    public void setBusId(long busId) {
        this.busId = busId;
    }
}

