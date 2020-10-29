package com.java.automation.lab.fall.tovstyka.core22.domain.placeForLiving;

import com.java.automation.lab.fall.tovstyka.core22.domain.interf.Counting;

import java.math.BigDecimal;

public class GuestHouse extends Hotel {

    GuestHouse(String name,String location,BigDecimal priceADay, int numberOfVacantseats){
            super(name, location, priceADay, numberOfVacantseats);
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getPriceADay() {
        return priceADay;
    }
    public void setPriceADay(BigDecimal priceADay) {
        this.priceADay = priceADay;
    }
    public int getNumberOfVacantseats() {
        return numberOfVacantseats;
    }
    public void setCheck(int numberOfVacantseats) {
        this.numberOfVacantseats = numberOfVacantseats;
    }

}
