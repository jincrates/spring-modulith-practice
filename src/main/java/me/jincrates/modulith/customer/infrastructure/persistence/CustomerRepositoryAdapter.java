package me.jincrates.modulith.customer.infrastructure.persistence;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import lombok.RequiredArgsConstructor;
import me.jincrates.modulith.customer.domain.core.model.Customer;
import me.jincrates.modulith.customer.domain.service.port.repository.CustomerRepository;
import me.jincrates.modulith.customer.infrastructure.persistence.entity.CustomerEntity;
import me.jincrates.modulith.customer.infrastructure.persistence.mapper.CustomerPersistenceMapper;
import me.jincrates.modulith.customer.infrastructure.persistence.repository.CustomerJdbcRepository;
import me.jincrates.modulith.shared.domain.core.valueobject.CustomerCode;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
class CustomerRepositoryAdapter implements CustomerRepository {

    private final CustomerJdbcRepository repository;

    @Override
    public Customer save(Customer customer) {
        CustomerEntity entity = CustomerPersistenceMapper.toCustomerEntity(customer);
        CustomerEntity saved = repository.save(entity);
        return CustomerPersistenceMapper.toCustomer(saved);

    }

    @Override
    public Customer update(Customer newCustomer) {
        if (newCustomer.id() == null) {
            throw new IllegalArgumentException("수정할 고객 ID는 필수입니다.");
        }
        CustomerEntity entity = CustomerPersistenceMapper.toCustomerEntity(newCustomer);
        CustomerEntity updated = repository.save(entity);
        return CustomerPersistenceMapper.toCustomer(updated);
    }

    @Override
    public Optional<Customer> findByCode(CustomerCode customerCode) {
        return repository.findByCode(customerCode.value())
            .map(CustomerPersistenceMapper::toCustomer);
    }

    @Override
    public Customer getByCode(CustomerCode customerCode) {
        return repository.findByCode(customerCode.value())
            .map(CustomerPersistenceMapper::toCustomer)
            .orElseThrow(() -> new IllegalArgumentException(
                "고객을 찾을 수 없습니다. customerId: " + customerCode.value())
            );
    }

    @Override
    public List<Customer> findAll() {
        return StreamSupport.stream(
                repository.findAll().spliterator(),
                false
            )
            .map(CustomerPersistenceMapper::toCustomer)
            .toList();
    }
}
