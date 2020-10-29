package com.java.automation.lab.fall.tovstyka.core22.domain;

import com.java.automation.lab.fall.tovstyka.core22.domain.transport.Transport;
import com.java.automation.lab.fall.tovstyka.core22.domain.placeForLiving.Hotel;
import com.java.automation.lab.fall.tovstyka.core22.domain.excursions.TourProg;
import com.java.automation.lab.fall.tovstyka.core22.domain.interf.Adding;
import com.java.automation.lab.fall.tovstyka.core22.domain.interf.Counting;

import java.math.BigDecimal;

public class PackageTour implements  Adding {
    private long[] packageTourListId;
    private long[] tourProhId;
    private long[] hotelId;
    private long[] transportId;
    private BigDecimal undervaluation;

    Transport transport;
    TourProg tourProg;
    Hotel hotel;
    Insure insure;
    PackageTour( long[] packageTourListId,long[] tourProhId,long[] hotelId,long[] transportId,
                 Transport sometransport,Hotel someHotel, TourProg someTourProg, Insure soneInsure, BigDecimal undervaluation){
        this.packageTourListId=packageTourListId;
        this.tourProhId=tourProhId;
        this.hotelId=hotelId;
        this.transportId=transportId;
        this.undervaluation = undervaluation;
        this.transport = sometransport;
        this.hotel = someHotel;
        this.insure = soneInsure;
        this.tourProg = someTourProg;
    }



    @Override
    public void add() {
    }


    public long[] getPackageTourListId() {
        return packageTourListId;
    }
    public void setPackageTourListId(long[] packageTourListId) {
        this.packageTourListId = packageTourListId;
    }
    public long[] getHotelId() {
        return hotelId;
    }
    public void setHotelId(long[] hotelId) {
        this.hotelId = hotelId;
    }
    public long[] getTourProhId() {
        return tourProhId;
    }
    public void setTourProhId(long[] tourProhId) {
        this.tourProhId = tourProhId;
    }
    public long[] getTransportId() {
        return transportId;
    }
    public void setTransportId(long[] transportId) {
        this.transportId = transportId;
    }
    public BigDecimal getUndervaluation() {
        return undervaluation;
    }
    public void setUndervaluation(BigDecimal undervaluation) {
        this.undervaluation = undervaluation;
    }
}
