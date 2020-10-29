package com.java.automation.lab.fall.tovstyka.core22.domain;

import java.util.ArrayList;
import java.util.List;

public  class Stages {
    Insure insure;
    Stages(Insure someinsure){
     this.insure = someinsure;
    }
    List<Stages> stage = new ArrayList<>();
}
