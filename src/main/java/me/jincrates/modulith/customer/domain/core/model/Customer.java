package me.jincrates.modulith.customer.domain.core.model;

import lombok.Builder;
import me.jincrates.modulith.shared.domain.core.valueobject.CustomerCode;

@Builder
public record Customer(
    Long id,
    CustomerCode code,
    String phone,
    String nickname
) {

    public Customer {
        if (code == null) {
            throw new IllegalArgumentException("고객 코드는 필수입니다.");
        }
        if (phone == null) {
            throw new IllegalArgumentException("고객 연락처는 필수입니다.");
        }
    }
}
