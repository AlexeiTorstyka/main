package com.java.automation.lab.fall.tovstyka.core22.domain;


import com.java.automation.lab.fall.tovstyka.core22.domain.interf.Adding;
import com.java.automation.lab.fall.tovstyka.core22.domain.interf.Counting;

import java.math.BigDecimal;

public class TourOperator implements Adding {
    private String name;
    private String location;
    private BigDecimal undervaluation;
    private long[] packageTourListId;
    PackageTour packageTour;
    TourOperator(String name,String location,long[] packageTourListId, BigDecimal undervaluation){
        this.undervaluation = undervaluation;
        this.name=name;
        this.location=location;
        this.packageTourListId=packageTourListId;
        this.packageTour= new PackageTour(packageTour.getPackageTourListId(),
                packageTour.getTourProhId(),packageTour.getHotelId(),packageTour.getTransportId(),
                packageTour.transport, packageTour.hotel, packageTour.tourProg, packageTour.insure,
                packageTour.getUndervaluation());
    }



    @Override
    public void add() {
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
    public long[] getPackageTourListId() {
        return packageTourListId;
    }
    public void setPackageTourListId(long[] packageTourListId) {
        this.packageTourListId = packageTourListId;
    }
}
