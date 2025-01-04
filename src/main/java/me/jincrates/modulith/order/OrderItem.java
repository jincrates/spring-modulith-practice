package me.jincrates.modulith.order;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("order_items")
public record OrderItem(
    @Id
    Long id,
    Long orderId,
    Long productId,
    int quantity
) {

}
