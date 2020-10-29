package com.java.automation.lab.fall.tovstyka.core22.domain.placeForLiving;

import interf.Counting;

import java.math.BigDecimal;

public abstract class Hotel implements Counting {

    String name;
    String location;
    BigDecimal priceADay;
    BigDecimal duration;

    BuisnesHotel buisnesHotel;
    GuestHouse guestHouse;
    Motel motel;
    Resort resort;
    Hotel(String name, String location, BigDecimal priceADay,BigDecimal duration){
        this.name = name;
        this.location = location;
        this.priceADay = priceADay;
        this.duration = duration;
    }

    @Override
    public BigDecimal count() {
        BigDecimal result;
        result = buisnesHotel.count().add(motel.count().add(guestHouse.count().add(resort.count())));
        return result;
    }



    public boolean add(){
        return true;
    }

}
