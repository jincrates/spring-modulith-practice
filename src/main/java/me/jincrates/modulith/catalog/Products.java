package me.jincrates.modulith.catalog;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.jincrates.modulith.catalog.model.ProductRepository;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class Products {

    private final ProductRepository repository;
    private final ApplicationEventPublisher publisher;

    //    @Async  // async를 통해서 비동기로 처리할 수 있다.
//    @EventListener
//    @ApplicationModuleListener
//    // Async와 Transactional을 사용하고 있다.
//    void receive(OrderPlacedEvent event) throws InterruptedException {
//        log.info(
//            "starting [{}]",
//            event
//        );
//        Thread.sleep(10_000);
//
//        Map<Long, OrderItem> orderItemMap = event.items().stream()
//            .collect(Collectors.toMap(
//                OrderItem::productId,
//                item -> item
//            ));
//
//        Set<Long> productIds = orderItemMap.keySet();
//        List<Product> finded = repository.findAllById(productIds);
//        if (finded.size() != productIds.size()) {
//            throw new IllegalStateException("상품을 찾을 수 없습니다. (productIds=" + productIds + ")");
//        }
//        List<Product> update = new ArrayList<>();
//        finded.forEach(product -> {
//            OrderItem orderItem = orderItemMap.get(product.id());
//            if (product.inventory() < orderItem.quantity()) {
//                throw new IllegalStateException(
//                    String.format(
//                        "재고가 부족합니다. (catalog.id=%d, catalog.inventory=%d, orderItem.quantity=%s)",
//                        product.id(),
//                        product.inventory(),
//                        orderItem.quantity()
//                    )
//                );
//            }
//            // 상품의 재고를 감소시키고
//            update.add(product.decreaseInventory(orderItem.quantity()));
//        });
//
//        // 저장한다.
//        List<Product> updated = repository.saveAll(update);
//
//        publisher.publishEvent(new ProductsDecreasedInventoryEvent(
//            event.orderId(),
//            updated.stream()
//                .map(Product::id)
//                .collect(Collectors.toSet())
//        ));
//
//        log.info(
//            "stopping [{}]",
//            event
//        );
//    }
}
