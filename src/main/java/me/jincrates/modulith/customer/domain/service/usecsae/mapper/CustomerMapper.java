package me.jincrates.modulith.customer.domain.service.usecsae.mapper;

import me.jincrates.modulith.customer.domain.core.model.Customer;
import me.jincrates.modulith.customer.domain.service.usecsae.request.CreateCustomerRequest;
import me.jincrates.modulith.customer.domain.service.usecsae.response.CreateCustomerResponse;
import me.jincrates.modulith.shared.domain.core.valueobject.CustomerCode;

public class CustomerMapper {

    public static Customer toCustomer(CreateCustomerRequest request) {
        return Customer.builder()
            .code(CustomerCode.generate())
            .phone(request.phone())
            .nickname(request.nickname())
            .build();
    }

    public static CreateCustomerResponse toCreateResponse(Customer customer) {
        return CreateCustomerResponse.builder()
            .code(customer.code().value())
            .phone(customer.phone())
            .nickname(customer.nickname())
            .build();
    }
}
