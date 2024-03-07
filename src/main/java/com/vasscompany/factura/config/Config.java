package com.vasscompany.factura.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.vasscompany.factura.models.Item;
import com.vasscompany.factura.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class Config {

   /*
   @Bean
    List<Item> itemsInvoice(){
        Product p1 = new Product("TV 24P LG", 8500);
        Product p2 = new Product("Samsung A20", 9000);

        List<Item> items = Arrays.asList(new Item(p1,10), new Item(p2, 15));

        return items;
    }
   
   */ 
    @Bean
    List<Item> itemsInvoice(){
        return Arrays.asList(
            new Item(new Product("TV 24P LG", 8500),10), 
            new Item(new Product("Samsung A20", 9000), 15)
            );
    }
  
    //@Primary
    @Bean("default")
    List<Item> itemsInvoiceOffice(){
        return Arrays.asList(
            new Item(new Product("Toperware", 100),5), 
            new Item(new Product("Camisa G", 250), 8),
            new Item(new Product("Mario bross", 498), 10)
            );
    }

}
