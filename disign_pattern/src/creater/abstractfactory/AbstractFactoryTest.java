package creater.abstractfactory;

import common.Car;
import common.Color;
import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {
    @Test
    public void test() {
        //先决定哪一个工厂
        AbstractCarFactory carFactory = AbstractFactory.chooseFactory("car");
        //生产汽车主体
        Car porsche = carFactory.produceCar("porsche");
        //涂色工厂
        AbstractCarFactory color = AbstractFactory.chooseFactory("color");
        Color white = color.doColor("white");
        porsche.desc();
        white.desc();
    }
}
