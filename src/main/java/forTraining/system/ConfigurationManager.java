package forTraining.system;

public class ConfigurationManager {

    private BrowserConfiguration browserConfiguration = new BrowserConfiguration();

    public BrowserConfiguration getBrowserConfiguration() {
        return browserConfiguration;
    }

    public void setBrowserConfiguration(BrowserConfiguration browserConfiguration) {
        this.browserConfiguration = browserConfiguration;
    }

    public void initConfiguration(){
        String browserName = SystemPropertiesUtils.readStringValue(SystemVariable.BROWSER);
        if (browserName.equals("")) return;
        browserConfiguration.setBrowser(browserName);
    }
}
