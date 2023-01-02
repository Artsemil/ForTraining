package forTraining.exceptions;

public class Generator {

    public String helloMessage(String name) throws SimpleException {
        if (name == null){
            throw new SimpleException(10, "Message is null");
        }
        return "Hello, " + name;
    }
}
