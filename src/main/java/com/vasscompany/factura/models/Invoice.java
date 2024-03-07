package com.vasscompany.factura.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Invoice {
    @Autowired
    private Client client;

    @Value("${invoice.description.office}")
    private String description;

    @Autowired
    @Qualifier("default")
    private List<Item> items;

    private int importe;

    /*
     * public int getImporte(){
     * int total = 0;
     * for (Item item : items) {
     * total += item.getImporte();
     * }
     * return total;
     * }
     */

    public int getImporte() {
       int total = items.stream()
       .map(item -> item.getImporte())
       .reduce(0, (sum, importe) -> sum + importe);
    
       return total;
    }
}
