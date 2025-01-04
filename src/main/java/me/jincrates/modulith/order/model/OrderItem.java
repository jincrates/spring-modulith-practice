package me.jincrates.modulith.order.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("order_items")
public record OrderItem(
    @Id
    Long id,
    Long productId,
    int quantity
) {

}
