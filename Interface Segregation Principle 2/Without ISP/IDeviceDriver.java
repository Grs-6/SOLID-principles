// A large, monolithic interface with too many methods
interface IDeviceDriver {
    // Network-related functions
    void sendData(String data);
    void receiveData();

    // Device health functions
    void checkDeviceHealth();
    void resetDevice();

    // Configuration functions
    void setIPAddress(String ip);
    String getIPAddress();
    void setSubnetMask(String subnetMask);
    String getSubnetMask();
}

