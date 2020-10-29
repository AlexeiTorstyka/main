package com.java.automation.lab.fall.tovstyka.core22.domain.placeForLiving;

import com.java.automation.lab.fall.tovstyka.core22.domain.interf.Counting;

import java.math.BigDecimal;

public class BuisnesHotel extends Hotel {
    private long id;



    BuisnesHotel(String name,String location, BigDecimal priceADay,int numberOfVacantseats, long id) {
    super(name, location, priceADay,numberOfVacantseats );
    this.id=id;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPriceADay(BigDecimal priceADay) {
        this.priceADay = priceADay;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfVacantseats() {
        return numberOfVacantseats;
    }
    public void setCheck(int numberOfVacantseats) {
        this.numberOfVacantseats = numberOfVacantseats;
    }

    public long getId() {
        return id;
    }

    public BigDecimal getPriceADay() {
        return priceADay;
    }
}
