package me.jincrates.modulith.notification;

import lombok.extern.slf4j.Slf4j;
import me.jincrates.modulith.order.event.OrderCompletedEvent;
import me.jincrates.modulith.order.event.OrderPlacedEvent;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class NotificationService {

    @ApplicationModuleListener
    public void sendNotification(OrderPlacedEvent event) {
        log.info(
            "Sending 'Order {} Placed' Notification!",
            event.orderId()
        );
    }

    @ApplicationModuleListener
    public void sendNotification(OrderCompletedEvent event) {
        log.info(
            "Sending 'Order {} Completed' Notification!",
            event.orderId()
        );
    }
}
