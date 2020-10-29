package com.java.automation.lab.fall.tovstyka.core22.domain;

import java.math.BigDecimal;

public class TravelAgency {
    private String name;
    private String location;
    private String[] tourOperatorList;
    private long id;
    private BigDecimal undervaluation; //interest of Agency
    TourOperator tourOperator;
    PackageTour packageTour;
    TravelAgency(String name,String location,String[] tourOperatorList,
                 long id,BigDecimal undervaluation,TourOperator sometourOperator,PackageTour somepackageTour){
        this.name=name;
        this.location=location;
        this.tourOperatorList=tourOperatorList;
        this.id=id;
        this.undervaluation = undervaluation;
        this.packageTour = somepackageTour;
        this.tourOperator =sometourOperator;
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
    public String[] getTourOperatorList() {
        return tourOperatorList;
    }
    public void setTourOperatorList(String[] tourOperatorList) {
        this.tourOperatorList = tourOperatorList;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public BigDecimal getUndervaluation() { return undervaluation; }
    public void setUndervaluation(BigDecimal undervaluation) { this.undervaluation = undervaluation; }
}
