package racinggame;

import org.assertj.core.api.AssertProvider;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import racinggame.model.Car;

public class CarTest {
    @Test
    void 자동차_위치가_정확해야한다(){
        Car car = new Car("abc", 0);
        car.setPosition(5);
        Assertions.assertThat(car.getPosition()).isEqualTo(5);
    }
}
