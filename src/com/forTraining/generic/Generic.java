package forTraining.generic;

public class Generic {
    public static void main(String[] args) {
        SecondObject firstObject = getObject(new SecondObject());
        firstObject.printClass();
    }

    private static <T> T getObject(T clazz){
        return clazz;
    }

    private static <T> void voidMethods(T clazz){

    }
}
