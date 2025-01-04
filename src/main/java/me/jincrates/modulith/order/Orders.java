package me.jincrates.modulith.order;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class Orders {

    private final OrderRepository repository;

    void place(Order order) {
        var saved = this.repository.save(order);
        log.info(
            "saved [{}]",
            saved
        );
    }
}
