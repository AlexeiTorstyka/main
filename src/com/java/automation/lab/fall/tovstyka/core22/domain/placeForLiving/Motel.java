package com.java.automation.lab.fall.tovstyka.core22.domain.placeForLiving;

import java.math.BigDecimal;

public class Motel extends Hotel{

    private BigDecimal discount;

    Motel(String name,String location,BigDecimal priceADay,int numberOfVacantseats,BigDecimal discount){
        super(name, location, priceADay, numberOfVacantseats);
        this.discount=discount;
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
    public BigDecimal getPriceADay() {
        return priceADay;
    }
    public void setPriceADay(BigDecimal priceADay) {
        this.priceADay = priceADay;
    }
    public BigDecimal getDiscount() {
        return discount;
    }
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }
    public int getNumberOfVacantseats() {
        return numberOfVacantseats;
    }
    public void setCheck(int numberOfVacantseats) {
        this.numberOfVacantseats = numberOfVacantseats;
    }


}
