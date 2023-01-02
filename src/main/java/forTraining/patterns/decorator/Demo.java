package forTraining.patterns.decorator;

public class Demo {

    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator dataSourceDecorator = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("src\\OutputDemo1.txt")));


        dataSourceDecorator.writeData(salaryRecords);
        DataSource plain = new FileDataSource("OutputDemo2.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(dataSourceDecorator.readData());
    }
}
