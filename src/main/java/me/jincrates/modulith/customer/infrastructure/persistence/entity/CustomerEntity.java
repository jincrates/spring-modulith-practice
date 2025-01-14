package me.jincrates.modulith.customer.infrastructure.persistence.entity;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Builder
@Table("customers")
public record CustomerEntity(
    @Id
    Long id,
    String code,
    String phone,
    String nickname
) {

}
