package com.lgutierrez.childservice;

import io.micrometer.observation.ObservationRegistry;
import io.micrometer.observation.aop.ObservedAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class ObserverConfig {

    @Bean
    ObservedAspect observerAspect(ObservationRegistry observationRegistry){
        return new ObservedAspect(observationRegistry);
    }
}
