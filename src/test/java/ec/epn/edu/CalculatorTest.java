package ec.epn.edu;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.Duration;

class CalculatorTest {
    private Calculator c;

    @BeforeAll
    public static void setUpClass() {
        System.out.println("setUpClass()");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("setUp()");
        c = new Calculator();
    }

    @Test
    public void given_two_integers_when_add_then_ok() {
        System.out.println("Test 1");
        assertEquals(6, c.addition(3, 3));
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok() {
        System.out.println("Test 2");
        assertEquals(7, c.subtraction(10, 3));
    }

    @Test
    public void given_two_integers_when_division_then_exception() {
        System.out.println("Test 3");
        assertThrows(ArithmeticException.class, () -> c.division(1, 0));
    }

    @Test
    public void given_a_time_when_timeout_then_exception() {
        System.out.println("Test 4");
        assertTimeout(Duration.ofMillis(150), () -> c.timeout(100));
    }

    @AfterEach
    public void tearDown() {
        System.out.println("tearDown()");
        c.setAnswer(0);
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("tearDownClass()");
    }
}
