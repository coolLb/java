package creater.abstractfactory;

import common.Black;
import common.Car;
import common.Color;
import common.White;

public class ColorFactory implements AbstractCarFactory {
    @Override
    public Car produceCar(String name) {
        return null;
    }

    @Override
    public Color doColor(String name) {

        if ("white".equals(name)) {
            return new White();
        } else if ("balck".equals(name)) {
            return new Black();
        }
        return null;
    }
}
