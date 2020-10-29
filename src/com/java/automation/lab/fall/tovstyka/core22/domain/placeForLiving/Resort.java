package com.java.automation.lab.fall.tovstyka.core22.domain.placeForLiving;

import com.java.automation.lab.fall.tovstyka.core22.domain.interf.Counting;

import java.math.BigDecimal;

public class Resort extends Hotel{

    private String distanceToSea;

    Resort(String name,String location,BigDecimal priceADay,int numberOfVacantSeats,String distanceToSea){
        super(name, location, priceADay, numberOfVacantSeats);
        this.distanceToSea=distanceToSea;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;

    }public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public BigDecimal getPriceADay() {
        return priceADay;
    }
    public void setPriceADay(BigDecimal price) {
        this.priceADay = priceADay;
    }
    public int getNumberOfVacantseats() {
        return numberOfVacantseats;
    }
    public void setCheck(int numberOfVacantseats) {
        this.numberOfVacantseats = numberOfVacantseats;
    }

    public String getDistanceToSea() {
        return distanceToSea;
    }

    public void setDistanceToSea(String distanceToSea) {
        this.distanceToSea = distanceToSea;
    }
}
