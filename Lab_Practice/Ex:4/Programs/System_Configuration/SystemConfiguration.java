public class SystemConfiguration {
    public static void main(String[] args) {
        System.out.println("App: " + ConfigManager.APP_NAME);
        System.out.println("Version: " + ConfigManager.VERSION);

        ConfigManager.logAccess();
        ConfigManager.logAccess();

        System.out.println("Total Accesses: " + ConfigManager.getAccessCount());
    }
}
class ConfigManager {
    public static final String APP_NAME = "SecureSystem";
    public static final double VERSION = 1.2;
    private static int accessCount = 0;

    private ConfigManager() {}

    public static void logAccess() {
        accessCount++;
        System.out.println("System accessed. Current count: " + accessCount);
    }

    public static int getAccessCount() {
        return accessCount;
    }
}
