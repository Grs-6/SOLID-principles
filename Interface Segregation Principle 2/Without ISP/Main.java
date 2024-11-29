public class Main {
    public static void main(String[] args) {
        // Network Developer
        INetworkDriver networkDeveloper = new Developer1();
        networkDeveloper.sendData("Hello, World!");
        networkDeveloper.receiveData();
        
        // Health Monitor
        IDeviceHealthDriver healthMonitor = new Developer2();
        healthMonitor.checkDeviceHealth();
        
        // Configuration Developer
        IConfigurationDriver configDeveloper = new Developer3();
        configDeveloper.setIPAddress("192.168.1.1");
    }
}
