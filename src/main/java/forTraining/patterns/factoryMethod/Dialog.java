package forTraining.patterns.factoryMethod;

public abstract class Dialog {

    public void renderWindow() {
        // ... остальной код диалога ...

        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
