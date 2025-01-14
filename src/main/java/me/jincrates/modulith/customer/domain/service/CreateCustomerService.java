package me.jincrates.modulith.customer.domain.service;

import lombok.RequiredArgsConstructor;
import me.jincrates.modulith.customer.domain.core.model.Customer;
import me.jincrates.modulith.customer.domain.service.port.repository.CustomerRepository;
import me.jincrates.modulith.customer.domain.service.usecsae.CreateCustomerUseCase;
import me.jincrates.modulith.customer.domain.service.usecsae.mapper.CustomerMapper;
import me.jincrates.modulith.customer.domain.service.usecsae.request.CreateCustomerRequest;
import me.jincrates.modulith.customer.domain.service.usecsae.response.CreateCustomerResponse;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class CreateCustomerService implements CreateCustomerUseCase {

    private final CustomerRepository repository;


    @Override
    public CreateCustomerResponse invoke(CreateCustomerRequest request) {
        Customer customer = CustomerMapper.toCustomer(request);
        Customer saved = repository.save(customer);
        return CustomerMapper.toCreateResponse(saved);
    }
}
