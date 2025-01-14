package me.jincrates.modulith.customer.domain.service.port.repository;

import java.util.List;
import java.util.Optional;
import me.jincrates.modulith.customer.domain.core.model.Customer;
import me.jincrates.modulith.shared.domain.core.valueobject.CustomerCode;

public interface CustomerRepository {

    Customer save(Customer customer);

    Customer update(Customer newCustomer);

    Optional<Customer> findByCode(CustomerCode customerCode);

    Customer getByCode(CustomerCode customerCode);

    List<Customer> findAll();
}
