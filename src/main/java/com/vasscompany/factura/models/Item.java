package com.vasscompany.factura.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    private Product product;

    private Integer quantity;

    public int getImporte(){
        return product.getPrice() * quantity;
    }
}
