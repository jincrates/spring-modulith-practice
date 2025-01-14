package me.jincrates.modulith.roma;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("로마 숫자 계산기 테스트")
class RomaNumberCalculatorTest {

    @Test
    @DisplayName("1을 입력하면  I를 반환한다.")
    void calculator_whenInputIs1_thenReturnI() {
        // given
        int number = 1;
        RomaNumberCalculator calculator = new RomaNumberCalculator();

        // when
        String result = calculator.calculator(number);

        // then
        assertThat(result).isEqualTo("I");
    }

    @Test
    @DisplayName("2을 입력하면  II를 반환한다.")
    void calculator_whenInputIs2_thenReturnII() {
        // given
        int number = 2;
        RomaNumberCalculator calculator = new RomaNumberCalculator();

        // when
        String result = calculator.calculator(number);

        // then
        assertThat(result).isEqualTo("II");
    }

    @Test
    @DisplayName("3을 입력하면  III를 반환한다.")
    void calculator_whenInputIs3_thenReturnIII() {
        // given
        int number = 3;
        RomaNumberCalculator calculator = new RomaNumberCalculator();

        // when
        String result = calculator.calculator(number);

        // then
        assertThat(result).isEqualTo("III");
    }

    @Test
    @DisplayName("4을 입력하면  IV를 반환한다.")
    void calculator_whenInputIs4_thenReturnIV() {
        // given
        int number = 4;
        RomaNumberCalculator calculator = new RomaNumberCalculator();

        // when
        String result = calculator.calculator(number);

        // then
        assertThat(result).isEqualTo("IV");
    }

    @Test
    @DisplayName("5을 입력하면  V를 반환한다.")
    void calculator_whenInputIs5_thenReturnV() {
        // given
        int number = 5;
        RomaNumberCalculator calculator = new RomaNumberCalculator();

        // when
        String result = calculator.calculator(number);

        // then
        assertThat(result).isEqualTo("V");
    }

    @Test
    @DisplayName("6을 입력하면  VI를 반환한다.")
    void calculator_whenInputIs6_thenReturnVI() {
        // given
        int number = 6;
        RomaNumberCalculator calculator = new RomaNumberCalculator();

        // when
        String result = calculator.calculator(number);

        // then
        assertThat(result).isEqualTo("VI");
    }

    @Test
    @DisplayName("7을 입력하면  VII를 반환한다.")
    void calculator_whenInputIs7_thenReturnVII() {
        // given
        int number = 7;
        RomaNumberCalculator calculator = new RomaNumberCalculator();

        // when
        String result = calculator.calculator(number);

        // then
        assertThat(result).isEqualTo("VII");
    }

    @Test
    @DisplayName("8을 입력하면  VIII를 반환한다.")
    void calculator_whenInputIs8_thenReturnVIII() {
        // given
        int number = 8;
        RomaNumberCalculator calculator = new RomaNumberCalculator();

        // when
        String result = calculator.calculator(number);

        // then
        assertThat(result).isEqualTo("VIII");
    }

    @Test
    @DisplayName("9을 입력하면  IX를 반환한다.")
    void calculator_whenInputIs9_thenReturnIX() {
        // given
        int number = 9;
        RomaNumberCalculator calculator = new RomaNumberCalculator();

        // when
        String result = calculator.calculator(number);

        // then
        assertThat(result).isEqualTo("IX");
    }

    @Test
    @DisplayName("10을 입력하면  X를 반환한다.")
    void calculator_whenInputIs10_thenReturnX() {
        // given
        int number = 10;
        RomaNumberCalculator calculator = new RomaNumberCalculator();

        // when
        String result = calculator.calculator(number);

        // then
        assertThat(result).isEqualTo("X");
    }

    @Test
    @DisplayName("11을 입력하면  X를 반환한다.")
    void calculator_whenInputIs11_thenReturnXI() {
        // given
        int number = 11;
        RomaNumberCalculator calculator = new RomaNumberCalculator();

        // when
        String result = calculator.calculator(number);

        // then
        assertThat(result).isEqualTo("XI");
    }
}
