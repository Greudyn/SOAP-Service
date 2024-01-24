package com.parameta.soap.service;

import jakarta.xml.ws.Endpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebServiceConfig {

    @Bean
    public Endpoint endpoint(EmpleadoSOAPService empleadoSOAPService) {
        return Endpoint.publish("/EmpleadoSOAPService", empleadoSOAPService);
    }
}
