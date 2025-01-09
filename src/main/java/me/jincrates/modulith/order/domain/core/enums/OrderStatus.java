package me.jincrates.modulith.order.domain.core.enums;

import java.util.Arrays;
import java.util.List;

public enum OrderStatus {
    PENDING,

    PAYMENT_FAILED,
    PAYMENT_APPROVED,

    SHIPPING_IN_PROGRESS,
    SHIPPING_FAILED,
    SHIPPING_COMPLETED,
    ;

    public void requireOneOf(OrderStatus... allowed) {
        if (!List.of(allowed).contains(this)) {
            throw new IllegalArgumentException(
                "Illegal state: " + this + ". Expected one of: " + Arrays.toString(allowed));
        }
    }
}
