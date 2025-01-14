package me.jincrates.modulith.customer.domain.service;

import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import me.jincrates.modulith.customer.domain.core.model.Customer;
import me.jincrates.modulith.customer.domain.service.port.repository.CustomerRepository;
import me.jincrates.modulith.customer.domain.service.usecsae.CreateCustomerUseCase;
import me.jincrates.modulith.customer.domain.service.usecsae.mapper.CustomerMapper;
import me.jincrates.modulith.customer.domain.service.usecsae.request.CreateCustomerRequest;
import me.jincrates.modulith.customer.domain.service.usecsae.response.CreateCustomerResponse;
import me.jincrates.modulith.shared.domain.core.event.customer.CustomerEvent.CustomerCreated;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
class CreateCustomerService implements CreateCustomerUseCase {

    private final CustomerRepository repository;
    private final ApplicationEventPublisher eventPublisher;

    @Override
    public CreateCustomerResponse invoke(CreateCustomerRequest request) {
        Customer customer = CustomerMapper.toCustomer(request);
        Customer saved = repository.save(customer);

        eventPublisher.publishEvent(CustomerCreated.builder()
            .code(saved.code())
            .issuedAt(LocalDateTime.now())
            .build()
        );

        return CustomerMapper.toCreateResponse(saved);
    }
}
