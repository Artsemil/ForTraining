package forTraining.patterns.singleton;

public class DemoSingleton {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("AAA");
        Singleton anotherSingl = Singleton.getInstance("BBB");
        System.out.println(singleton.value);
        System.out.println(anotherSingl.value);
    }
}
