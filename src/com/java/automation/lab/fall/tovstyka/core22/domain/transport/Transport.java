package com.java.automation.lab.fall.tovstyka.core22.domain.transport;

import com.java.automation.lab.fall.tovstyka.core22.domain.interf.Counting;

import java.math.BigDecimal;

public abstract class Transport {
     String name;
     String startPoint;
     BigDecimal distance;
     BigDecimal pricePerMile;
     boolean check;

        BusCompany busCompany;
        Charters charters;
        Train train;

    Transport(String name, String startPoint, BigDecimal distance, BigDecimal pricePerMile, boolean check) {
            this.name = name;
            this.startPoint = startPoint;
            this.distance = distance;
            this.pricePerMile = pricePerMile;
            this.check = check;

            this.busCompany = new BusCompany(busCompany.getName(), busCompany.getLocation(),
                    busCompany.getBusId(), busCompany.getPrice(),busCompany.getDiscount(),
                    busCompany.getUndervaluation(),busCompany.bus);
            this.charters = new Charters(charters.getName(), charters.getLocation(), charters.getCharterId(),
                    charters.getPrice(),charters.getDiscount(), charters.plane, charters.ship);
        }
}
