package me.jincrates.modulith.customer.infrastructure.persistence.repository;

import java.util.Optional;
import me.jincrates.modulith.customer.infrastructure.persistence.entity.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerJdbcRepository extends CrudRepository<CustomerEntity, Long> {

    boolean existsByCode(String customerCode);

    Optional<CustomerEntity> findByCode(String customerCode);
}
