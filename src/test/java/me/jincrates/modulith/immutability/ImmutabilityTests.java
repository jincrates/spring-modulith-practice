package me.jincrates.modulith.immutability;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("불변성 테스트")
public class ImmutabilityTests {

    @Test
    @DisplayName("test")
    void orderMutable() {
        OrderMutable order = new OrderMutable(
            1L,
            10_000L
        );

        // 쿠폰 적용

        // 결제 요청

        applyCoupon(order);

        // then
        assertThat(order.getAmount()).isEqualTo(15_000L);
    }

    private void applyCoupon(OrderMutable order) {
        order.subtractAmount(5_000L);
    }

    /**
     * 가변 Order
     */
    class OrderMutable {

        private Long id;
        private long amount;

        public OrderMutable(
            Long id,
            long amount
        ) {
            this.id = id;
            this.amount = amount;
        }

        public long getAmount() {
            return amount;
        }

        public void addAmount(long amount) {
            this.amount += amount;
        }

        public void subtractAmount(long amount) {
            this.amount -= amount;
        }
    }


    /**
     * 불변 Order
     */
    record OrderImmutable(
        Long orderId,
        long amount
    ) {

    }
}
