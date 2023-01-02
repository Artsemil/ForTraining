package forTraining.system;

public class SystemPropertiesUtils {

    public static String readStringValue(String systemVariable) {
        String envVariable = System.getenv(systemVariable);
        if (null == envVariable) {
            return "";
        }
        return envVariable;
    }
}
