package forTraining.patterns.singleton;

public class Singleton {

    private static Singleton instance;
    public String value;

    public static Singleton getInstance(String value){
        if (instance == null){
            instance = new Singleton(value);
        }
        return instance;
    }

    private Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }
}
