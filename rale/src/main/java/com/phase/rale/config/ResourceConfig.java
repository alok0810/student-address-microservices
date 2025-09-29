package com.phase.rale.config;

import com.phase.rale.services.A;
import com.phase.rale.services.B;
import com.phase.rale.services.C;
import com.phase.rale.services.Wheel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ResourceConfig {


   @Bean("aWheel")
    public Wheel a()
    {
       return new A();
    }

    @Bean("bWheel")
    public Wheel b()
    {
        return new B();
    }

   @Primary
   @Bean("cWheel")
    public Wheel c()
    {
        return new C();
    }
}
