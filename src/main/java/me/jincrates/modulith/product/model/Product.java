package me.jincrates.modulith.product.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("products")
public record Product(
    @Id
    Long id,
    String name,
    int inventory
) {

    // 재고 차감
    public Product decreaseInventory(int quantity) {
        return new Product(
            id,
            name,
            inventory - quantity
        );
    }
}
