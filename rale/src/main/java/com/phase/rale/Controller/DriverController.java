package com.phase.rale.Controller;

import com.phase.rale.services.DriverClass;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/driver")
public class DriverController {

    private final DriverClass driver;

    public DriverController(DriverClass driver) {
        this.driver = driver;
    }

    @GetMapping("/execute")
    public String execute() {
        return driver.execute();
    }
}
