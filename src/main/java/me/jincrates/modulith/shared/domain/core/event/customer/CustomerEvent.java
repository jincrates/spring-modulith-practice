package me.jincrates.modulith.shared.domain.core.event.customer;

import java.time.LocalDateTime;
import lombok.Builder;
import me.jincrates.modulith.shared.domain.core.event.DomainEvent;
import me.jincrates.modulith.shared.domain.core.valueobject.CustomerCode;

public sealed interface CustomerEvent extends DomainEvent {

    @Builder
    record CustomerCreated(
        CustomerCode code,
        LocalDateTime issuedAt
    ) implements CustomerEvent {

    }
}
