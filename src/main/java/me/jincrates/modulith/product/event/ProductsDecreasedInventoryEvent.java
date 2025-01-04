package me.jincrates.modulith.product.event;

import java.util.Set;

public record ProductsDecreasedInventoryEvent(
    Long orderId,
    Set<Long> productIds
) {

}
