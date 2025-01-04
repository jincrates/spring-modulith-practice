package me.jincrates.modulith.order.event;

import java.util.Set;
import me.jincrates.modulith.order.model.OrderItem;

public record OrderPlacedEvent(
    Long orderId,
    Set<OrderItem> items
) {

}
