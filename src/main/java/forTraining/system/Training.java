package forTraining.system;

public class Training {
    private static ConfigurationManager configurationManager = new ConfigurationManager();
    private static BrowserConfiguration browserConfiguration = configurationManager.getBrowserConfiguration();

    public static void main(String[] args) {
        configurationManager.initConfiguration();
        System.out.println(browserConfiguration.getBrowser());
    }
}
