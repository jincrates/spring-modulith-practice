package me.jincrates.modulith.customer.application.api;

import lombok.RequiredArgsConstructor;
import me.jincrates.modulith.customer.domain.service.usecsae.CreateCustomerUseCase;
import me.jincrates.modulith.customer.domain.service.usecsae.request.CreateCustomerRequest;
import me.jincrates.modulith.customer.domain.service.usecsae.response.CreateCustomerResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/customers")
public class CustomerApi {

    private final CreateCustomerUseCase createCustomerUseCase;

    @PostMapping
    public ResponseEntity<CreateCustomerResponse> createCustomer(
        @Validated @RequestBody CreateCustomerRequest request
    ) {
        CreateCustomerResponse response = createCustomerUseCase.invoke(request);
        return ResponseEntity.ok(response);
    }
}
