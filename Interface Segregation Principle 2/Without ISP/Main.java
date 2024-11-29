public class Main {
    public static void main(String[] args) {
        // Network Developer
        DeviceDriver networkDeveloper = new NetworkDeveloper();
        networkDeveloper.sendData("Hello, World!");  // Sends data
        networkDeveloper.receiveData();              // Receives data
        
        // Health Monitor
        DeviceDriver healthMonitor = new HealthMonitor();
        healthMonitor.checkDeviceHealth();  // Checks the health of the device
        
        // Configuration Developer
        DeviceDriver configDeveloper = new ConfigurationDeveloper();
        configDeveloper.setIPAddress("192.168.1.1");  // Sets the device IP address
    }
}
