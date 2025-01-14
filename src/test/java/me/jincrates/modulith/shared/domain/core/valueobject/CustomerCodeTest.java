package me.jincrates.modulith.shared.domain.core.valueobject;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CustomerCodeTest {

    @Test
    @DisplayName("고객 ID를 정상적으로 생성한다.")
    void generate() {
        // given // when
        CustomerCode result = CustomerCode.generate();

        // then
        assertThat(result).isNotNull();
    }

    @Test
    @DisplayName("고객 ID 생성 시 null 값이 들어오면 예외를 발생시킨다.")
    void generate_WhenNullValue() {
        // given
        String value = null;

        // when
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> new CustomerCode(value)
        );

        // then
        assertAll(
            () -> assertThat(exception).isNotNull(),
            () -> assertThat(exception.getMessage()).isEqualTo("Customer ID must not be null")
        );
    }
}
