package com.phase.rale.services;

import org.springframework.stereotype.Service;

public class C implements Wheel {
    @Override
    public String noOfWheel() {
        return "C has four wheels";
    }
}
