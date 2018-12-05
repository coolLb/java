package creater.abstractfactory;

import common.Benz;
import common.Car;
import common.Color;
import common.Porsche;

public class CarMainFactory implements AbstractCarFactory {
    @Override
    public Car produceCar(String name) {
        if ("porsche".equals(name)) {
            return new Porsche();
        } else if ("Benz".equals(name)) {
            return new Benz();
        }
        return null;
    }

    @Override
    public Color doColor(String name) {

        return null;
    }
}
