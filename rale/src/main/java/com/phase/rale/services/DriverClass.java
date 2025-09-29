package com.phase.rale.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class DriverClass {

    @Autowired
    @Qualifier("bWheel")
    Wheel wheel;
    public String execute()
    {
        return wheel.noOfWheel();
    }

}
