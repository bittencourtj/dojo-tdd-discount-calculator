package test;

import discountCalculator.DiscountCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiscountCalculatorTest {

    DiscountCalculator discountCalculator = new DiscountCalculator();

    @Test
    void shouldReturnStringHelloWorld(){
        String expectedValue = "Ok";
        String actual = discountCalculator.healthCheck();

        Assertions.assertEquals(expectedValue, actual);
    }
}
