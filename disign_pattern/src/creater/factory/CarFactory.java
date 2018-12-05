package creater.factory;

import common.Benz;
import common.Car;
import common.Porsche;

/**
 * 汽车工厂
 */
public class CarFactory {

    /**
     * 生产汽车
     * @param carName
     * @return
     */
    public static Car produceCar(String carName) {

        if ("porsche".equals(carName)) {
            return new Porsche();
        } else if ("Benz".equals(carName)) {
            return new Benz();
        }
        return null;
    }
}
