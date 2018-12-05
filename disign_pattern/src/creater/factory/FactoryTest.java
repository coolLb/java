package creater.factory;

import common.Car;
import org.junit.jupiter.api.Test;

public class FactoryTest {

    /**
     * 只需要告诉汽车工厂你需要什么牌子的车就够了
     */
    @Test
    public void test() {

        Car porsche = CarFactory.produceCar("porsche");
        porsche.desc();
        Car benz = CarFactory.produceCar("Benz");
        benz.desc();
    }
}
