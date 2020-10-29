package com.java.automation.lab.fall.tovstyka.core22.domain;

import java.math.BigDecimal;

public class Insure  {
    private String nameOfInsurer;
    private String nameOfInsurence;
    private BigDecimal priceOfInsurence;
    Insure(String nameOfInsurer,String nameOfInsurence, BigDecimal priceOfInsurence){
        this.nameOfInsurer= nameOfInsurer;
        this.nameOfInsurence = nameOfInsurence;
        this.priceOfInsurence = priceOfInsurence;
    }


    public String getNameOfInsurer() { return nameOfInsurer; }
    public String getNameOfInsurence() { return nameOfInsurence; }
    public BigDecimal getPriceOfInsurence() { return priceOfInsurence; }
    public void setNameOfInsurer(String nameOfInsurer) { this.nameOfInsurer = nameOfInsurer; }
    public void setNameOfInsurence(String nameOfInsurence) { this.nameOfInsurence = nameOfInsurence; }
    public void setPriceOfInsurence(BigDecimal priceOfInsurence) { this.priceOfInsurence = priceOfInsurence; }
}
