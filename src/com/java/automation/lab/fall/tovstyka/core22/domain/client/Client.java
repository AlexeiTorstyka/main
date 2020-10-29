package com.java.automation.lab.fall.tovstyka.core22.domain.client;

import com.java.automation.lab.fall.tovstyka.core22.domain.Enumeration.Privileges;
import com.java.automation.lab.fall.tovstyka.core22.domain.PackageTour;

import java.math.BigDecimal;

public class Client  {
    private String name;
    private String location;
    private Privileges promocode;
    private int age;
    private long id;
    private BigDecimal budget;
PackageTour packageTour;
    private BigDecimal countThePrice(Privileges promocode) {
        BigDecimal result;
        BigDecimal res;
        BigDecimal one = new BigDecimal("1");
        res = one.subtract(promocode.getDis());
        result = packageTour.count().multiply(res);
        return result;
    }

    private int booking() { return 0; }

    Client(String name, String location, Privileges promocode,int age,long id, BigDecimal budget) {
        this.name = name;
        this.location = location;
        this.promocode = promocode;
        this.age = age;
        this.id = id;
        this.budget = budget;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Privileges getPromocode() {
        return promocode;
    }

    public void setPromocode(Privileges promocode) {
        this.promocode = promocode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}