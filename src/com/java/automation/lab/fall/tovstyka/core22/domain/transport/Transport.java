package com.java.automation.lab.fall.tovstyka.core22.domain.transport;

import interf.Counting;

import java.math.BigDecimal;

public abstract class Transport implements Counting {
    private String name;
    private String startPoint;
    private BigDecimal distance;
    private BigDecimal pricePerMile;
    private boolean check;

        BusCompany busCompany;
        Charters charters;
        Train train;

    @Override
    public BigDecimal count() {
        BigDecimal result;
        result = busCompany.count().add(charters.count().add(train.count()));
        return null;
    }

    Transport(String name, String startPoint, BigDecimal distance, BigDecimal pricePerMile, boolean check) {
            this.name = name;
            this.startPoint = startPoint;
            this.distance = distance;
            this.pricePerMile = pricePerMile;
            this.check = check;

            this.busCompany = new BusCompany(busCompany.getName(), busCompany.getLocation(),
                    busCompany.getBusId(), busCompany.getPrice(),busCompany.getDiscount(),
                    busCompany.getUndervaluation(),busCompany.bus);
            this.charters = new Charters(charters.getName(), charters.getLocation(), charters.getCharterId(),
                    charters.getPrice(),charters.getDiscount(), charters.plane, charters.ship);
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

    public boolean getCheck() {
        return check;
    }
    public void setCheck(boolean check) {
        this.check = check;
    }
}
