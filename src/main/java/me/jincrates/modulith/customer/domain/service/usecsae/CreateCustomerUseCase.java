package me.jincrates.modulith.customer.domain.service.usecsae;

import me.jincrates.modulith.customer.domain.service.usecsae.request.CreateCustomerRequest;
import me.jincrates.modulith.customer.domain.service.usecsae.response.CreateCustomerResponse;

public interface CreateCustomerUseCase {

    CreateCustomerResponse invoke(CreateCustomerRequest request);
}
