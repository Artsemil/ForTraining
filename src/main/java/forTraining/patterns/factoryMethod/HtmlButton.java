package forTraining.patterns.factoryMethod;

public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("<button>TEST.Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
