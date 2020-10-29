package com.java.automation.lab.fall.tovstyka.core22.domain;

import java.math.BigDecimal;

public class Price {
    private BigDecimal taxes;
    private BigDecimal basicPrice;
    private BigDecimal total;
    private BigDecimal discount;
    Price(BigDecimal taxes,BigDecimal basicPrice, BigDecimal total, BigDecimal discount){
        this.taxes =taxes;
        this.basicPrice = basicPrice;
        this.total = total;
        this.discount = discount;
    }
    BigDecimal calculate(BigDecimal taxes, BigDecimal basicPrice,BigDecimal discount){
        BigDecimal one = new BigDecimal("1");
        BigDecimal result;
        BigDecimal tax = taxes.add(one);
        result = tax.multiply(basicPrice.multiply(one.subtract(discount)));
        return  result;
    }

    public BigDecimal getTaxes() {
        return taxes;
    }

    public BigDecimal getBasicPrice() {
        return basicPrice;
    }

    public BigDecimal getTotal() {
        return calculate(taxes,basicPrice,discount);
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setTaxes(BigDecimal taxes) {
        this.taxes = taxes;
    }

    public void setBasicPrice(BigDecimal basicPrice) {
        this.basicPrice = basicPrice;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }
}
