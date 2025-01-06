package me.jincrates.modulith.catalog.event;

import java.util.Set;

public record ProductsDecreasedInventoryEvent(
    Long orderId,
    Set<Long> productIds
) {

}
