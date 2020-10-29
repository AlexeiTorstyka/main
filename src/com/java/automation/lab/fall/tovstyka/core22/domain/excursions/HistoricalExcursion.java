package com.java.automation.lab.fall.tovstyka.core22.domain.excursions;


import java.math.BigDecimal;

public class HistoricalExcursion extends TourProg {

    private BigDecimal discount;
    private boolean check;

    @Override
    public BigDecimal count() {
        BigDecimal one = new BigDecimal("1");
        BigDecimal r = one.subtract(discount);
        BigDecimal res = r.multiply(price);
        return res;
    }


    HistoricalExcursion(String name, String location, BigDecimal price,boolean check){
       super(name, location, price);
        this.check=check;

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

    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) { this.price = price; }

    public boolean getCheck() {
        return check;
    }
    public void setCheck(boolean check) {
        this.check = check;
    }

    public void setDiscount(BigDecimal discount) { this.discount = discount; }
    public BigDecimal getDiscount() { return discount; }
}
