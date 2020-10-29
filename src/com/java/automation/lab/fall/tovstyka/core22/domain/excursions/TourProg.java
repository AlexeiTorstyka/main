package com.java.automation.lab.fall.tovstyka.core22.domain.excursions;

import interf.Counting;

import java.math.BigDecimal;

public abstract class TourProg implements Counting {

    String name;
    String location;
    BigDecimal price;
    HistoricalExcursion historicalExcursion;
    SightseeingExcursion sightseeingExcursion;
    ThematicExcursion thematicExcursion;
    TourProg(String name, String location, BigDecimal price){
        this.name = name;
        this.location= location;
        this.price = price;
    }

    @Override
    public BigDecimal count() {
        BigDecimal result;
        result = thematicExcursion.count().add(sightseeingExcursion.count().add(historicalExcursion.count()));
        return result;
    }
}

