package forTraining.reflection;

public class FinanceExample {

    public static void main(String[] args) {
        FinanceInfoBuilder fib = FinanceInfoBuilderFactory.getFinanceInfoBuilder();
        FinanceInformation info = fib.buildFinanceInformation();
        // Вызов getClass() позволяет получить описание класса у объекта
        System.out.println("Имя класса:" + fib.getClass().getCanonicalName());
    }
}
