package me.jincrates.modulith.customer.infrastructure.persistence.mapper;

import me.jincrates.modulith.customer.domain.core.model.Customer;
import me.jincrates.modulith.customer.infrastructure.persistence.entity.CustomerEntity;
import me.jincrates.modulith.shared.domain.core.valueobject.CustomerCode;

public class CustomerPersistenceMapper {

    public static CustomerEntity toCustomerEntity(Customer customer) {
        return CustomerEntity.builder()
            .id(customer.id())
            .code(customer.code().value())
            .phone(customer.phone())
            .nickname(customer.nickname())
            .build();
    }

    public static Customer toCustomer(CustomerEntity customerEntity) {
        return Customer.builder()
            .id(customerEntity.id())
            .code(new CustomerCode(customerEntity.code()))
            .phone(customerEntity.phone())
            .nickname(customerEntity.nickname())
            .build();
    }
}
