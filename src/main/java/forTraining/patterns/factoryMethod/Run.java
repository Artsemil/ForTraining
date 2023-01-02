package forTraining.patterns.factoryMethod;

public class Run {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure(-3);
        dialog.createButton().render();
    }

    private static void configure(int a) {
        if (a > 0) {
            dialog = new WindowsDialog();
        } else dialog = new HtmlDialog();
    }
}
