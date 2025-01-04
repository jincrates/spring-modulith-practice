package me.jincrates.modulith.order;

import java.util.Set;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("orders")
public record Order(
    @Id
    Long id,
    Set<OrderItem> items
) {

}
