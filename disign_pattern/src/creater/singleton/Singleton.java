package creater.singleton;

public class Singleton {

    private static Singleton singleton = null;

    private Singleton() {

    }

    private static Singleton getInstance() {
        singleton = new Singleton();
        return singleton;
    }
}
