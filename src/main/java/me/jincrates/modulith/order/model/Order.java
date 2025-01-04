package me.jincrates.modulith.order.model;

import java.util.Set;
import me.jincrates.modulith.order.enums.OrderStatus;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("orders")
public record Order(
    @Id
    Long id,
    OrderStatus status,
    Set<OrderItem> items,
    String failureReason
) {

    public Order complete() {
        return new Order(
            id,
            OrderStatus.COMPLETED,
            items,
            failureReason
        );
    }
}
