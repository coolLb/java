package creater.abstractfactory;

import common.Car;
import common.Color;

public interface AbstractCarFactory {

    Car produceCar(String name);

    Color doColor(String name);
}
