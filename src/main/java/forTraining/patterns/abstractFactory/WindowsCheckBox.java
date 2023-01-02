package forTraining.patterns.abstractFactory;

public class WindowsCheckBox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
