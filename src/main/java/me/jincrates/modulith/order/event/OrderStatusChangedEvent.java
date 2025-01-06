package me.jincrates.modulith.order.event;

import me.jincrates.modulith.order.enums.OrderStatus;

public record OrderStatusChangedEvent(
    Long orderId,
    OrderStatus status,
    String customerId
) {

}
