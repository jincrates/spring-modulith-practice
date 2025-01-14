package me.jincrates.modulith.customer.domain.service.usecsae.response;

import lombok.Builder;

@Builder
public record CreateCustomerResponse(
    String code,
    String phone,
    String nickname
) {

}
