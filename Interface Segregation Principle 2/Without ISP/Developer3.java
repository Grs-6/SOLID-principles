// Developer working on configuration-related functionality
class Developer3 implements IDeviceDriver {
    @Override
    public void sendData(String data) {
        // Unused, but must implement it
    }

    @Override
    public void receiveData() {
        // Unused, but must implement it
    }

    @Override
    public void checkDeviceHealth() {
        // Unused, but must implement it
    }

    @Override
    public void resetDevice() {
        // Unused, but must implement it
    }

    @Override
    public void setIPAddress(String ip) {
        System.out.println("Setting IP address to: " + ip);
    }

    @Override
    public String getIPAddress() {
        // Unused, but must implement it
        return null;
    }

    @Override
    public void setSubnetMask(String subnetMask) {
        // Unused, but must implement it
    }

    @Override
    public String getSubnetMask() {
        // Unused, but must implement it
        return null;
    }
}