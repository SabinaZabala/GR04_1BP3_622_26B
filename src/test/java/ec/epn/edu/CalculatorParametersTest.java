package ec.epn.edu;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorParametersTest {

    // Proveedor de datos para el test parametrizado
    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(2, 4, 6),
                Arguments.of(1, 8, 9),
                Arguments.of(2, 5, 7),
                Arguments.of(7, 3, 10),
                Arguments.of(22, 4, 26),
                Arguments.of(12, 14, 26)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void given_parameters_when_addition_then_summation(int a, int b, int expected) {
        Calculator c = new Calculator();
        int actual = c.addition(a, b);
        assertEquals(expected, actual);
    }
}
