package com.java.automation.lab.fall.tovstyka.core22.domain.placeForLiving;

import com.java.automation.lab.fall.tovstyka.core22.domain.interf.Counting;

import java.math.BigDecimal;

public abstract class Hotel{
    String name;
    String location;
    BigDecimal priceADay;
    int numberOfVacantseats;

    Hotel(String name, String location, BigDecimal priceADay,int numberOfVacantseats){
        this.name = name;
        this.location = location;
        this.priceADay = priceADay;
        this.numberOfVacantseats =numberOfVacantseats;
    }
    public boolean add(){
        return true;
    }
}
