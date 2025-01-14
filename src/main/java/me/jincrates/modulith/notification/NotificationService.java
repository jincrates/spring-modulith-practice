package me.jincrates.modulith.notification;

import lombok.extern.slf4j.Slf4j;
import me.jincrates.modulith.shared.domain.core.event.customer.CustomerEvent.CustomerCreated;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class NotificationService {

    @ApplicationModuleListener
    public void sendNotification(CustomerCreated event) {
        log.info(
            "Customer '{}' Created Notification!",
            event.code().value()
        );
    }
}
