package com.vasscompany.factura.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Client {
    @Value("${client.name}")
    private String name;
    
    @Value("${client.lastname}")
    private String lastname;
    
}
