package forTraining.patterns.abstractFactory;

public class Demo {

    private static Application configureApplication(int a) {
        Application app;
        GUIFactory guiFactory;
        if (a > 0) {
            guiFactory = new WindowsFactory();
            app = new Application(guiFactory);
        } else {
            guiFactory = new MacOSFactory();
            app = new Application(guiFactory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication(10);
        app.paint();
    }
}
