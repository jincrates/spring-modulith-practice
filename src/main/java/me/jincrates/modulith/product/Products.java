package me.jincrates.modulith.product;

import lombok.extern.slf4j.Slf4j;
import me.jincrates.modulith.order.OrderPlacedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
public class Products {

    @Async  // async를 통해서 비동기로 처리할 수 있다.
    @EventListener
    void receive(OrderPlacedEvent event) throws InterruptedException {
        log.info(
            "starting [{}]",
            event
        );
        Thread.sleep(5_000);
        log.info(
            "stopping [{}]",
            event
        );
    }
}
