package utils;

public class ConfigurationProperties {

    public static String getBrowser() {
        return System.getProperty("browser");
    }

    public static String getEnvironment() {
        return System.getProperty("environment");
    }

}
