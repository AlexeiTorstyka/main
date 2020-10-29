package Enumeration;

import java.math.BigDecimal;

public enum Privileges {
    Alexei2020(new BigDecimal("0.1")),Zhive(new BigDecimal("0.8")),Sasha3per(new BigDecimal("0.97")), JaTut(new BigDecimal("0.5"));
    private BigDecimal dis;
    Privileges(BigDecimal dis){
        this.dis= dis;
    }
    public BigDecimal getDis(){
        return  dis;
    }
}
