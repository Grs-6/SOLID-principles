// Developer working on health monitoring-related functionality
class Developer2 implements IDeviceDriver {
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
        System.out.println("Checking device health...");
    }

    @Override
    public void resetDevice() {
        System.out.println("Resetting device...");
    }

    @Override
    public void setIPAddress(String ip) {
        // Unused, but must implement it
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