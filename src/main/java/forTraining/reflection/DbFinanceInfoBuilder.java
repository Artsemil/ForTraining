package forTraining.reflection;

public class DbFinanceInfoBuilder implements FinanceInfoBuilder{

    @Override
    public FinanceInformation buildFinanceInformation() {
        System.out.println("Вызов метода для объекта DbFinanceInfoBuilder");
        return new FinanceInformation();
    }
}
