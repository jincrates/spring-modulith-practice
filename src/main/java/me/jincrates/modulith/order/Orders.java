package me.jincrates.modulith.order;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class Orders {

    private final OrderRepository repository;
    private final ApplicationEventPublisher publisher;

    void place(Order order) {
        var saved = this.repository.save(order);
        log.info(
            "saved [{}]",
            saved
        );
        this.publisher.publishEvent(new OrderPlacedEvent(saved.id()));
        /**
         * 주문 생성 이후에 다음과 같은 작업을 수행할 수 있다.
         * 그러나 이러한 작업들은 주문 서비스의 책임이 아니라 다른 서비스의 책임이기 때문에
         * 주문 서비스에서 직접 수행하는 것은 바람직하지 않다.
         */
        // products.updateInventory();
        // fulfillment.send();
    }
}
