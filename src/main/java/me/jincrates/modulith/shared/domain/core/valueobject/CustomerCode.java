package me.jincrates.modulith.shared.domain.core.valueobject;

public record CustomerCode(
    String value
) {

    public CustomerCode {
        if (value == null) {
            throw new IllegalArgumentException("고객 ID는 필수입니다.");
        }
    }

    public static CustomerCode generate() {
        return new CustomerCode("C" + System.currentTimeMillis());
    }
}
