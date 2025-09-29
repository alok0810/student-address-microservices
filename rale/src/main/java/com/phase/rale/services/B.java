package com.phase.rale.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class B implements Wheel{
    @Override
    public String noOfWheel() {
        return "B  has three wheels";
    }
}
