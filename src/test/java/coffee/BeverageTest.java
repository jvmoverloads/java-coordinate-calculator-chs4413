package coffee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import coffee.after.CaffeinBeverage;
import coffee.after.Coffee;
import coffee.after.Tea;

public class BeverageTest {

    @Test
    @DisplayName("티(Tea)는 카페인 음료이다.")
    void test() {
        Assertions.assertInstanceOf(CaffeinBeverage.class, new Tea());
    }

    @Test
    @DisplayName("커피(Coffee)는 카페인 음료이다.")
    void test2() {
        Assertions.assertInstanceOf(CaffeinBeverage.class, new Coffee());
    }
}
