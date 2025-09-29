package com.phase.rale.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class A implements Wheel{

    @Override
    public String noOfWheel() {
        return "A has 2 wheels";
    }

}
