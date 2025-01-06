package me.jincrates.modulith.order.model;

import java.util.Set;
import lombok.AccessLevel;
import lombok.Builder;
import me.jincrates.modulith.order.enums.OrderStatus;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Builder(access = AccessLevel.PRIVATE)
@Table("orders")
public record Order(
    @Id
    Long id,
    OrderStatus status,
    Set<OrderItem> items,
    String failureReason
) {

    public Order pay(boolean ok) {
        status.requireOneOf(OrderStatus.PENDING);
        return Order.builder()
            .id(id)
            .status(ok ? OrderStatus.PAYMENT_APPROVED : OrderStatus.PAYMENT_FAILED)
            .items(items)
            .failureReason(ok ? null : "Payment failed")
            .build();
    }
}
