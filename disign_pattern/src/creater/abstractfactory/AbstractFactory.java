package creater.abstractfactory;

public class AbstractFactory {

    public static AbstractCarFactory chooseFactory(String factoryName) {

        if ("car".equals(factoryName)) {
            return new CarMainFactory();
        } else {
            return new ColorFactory();
        }
    }

}
