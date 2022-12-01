package mx.com.cj.patrones.creacionales.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");

        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
