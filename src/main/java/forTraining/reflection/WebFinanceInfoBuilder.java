package forTraining.reflection;

public class WebFinanceInfoBuilder implements FinanceInfoBuilder {
    @Override
    public FinanceInformation buildFinanceInformation() {
        System.out.println("Вызов метода для объекта WebFinanceInfoBuilder");
        return new FinanceInformation();
    }
}
