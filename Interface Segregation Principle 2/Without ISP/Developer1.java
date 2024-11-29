// Developer working on network-related functionality
class Developer1 implements IDeviceDriver {
    @Override
    public void sendData(String data) {
        System.out.println("Sending data: " + data);
    }

    @Override
    public void receiveData() {
        System.out.println("Receiving data...");
    }

    // All other methods are irrelevant for this developer, but they still have to be implemented.
    @Override
    public void checkDeviceHealth() {
        // Unused, but must implement it
    }

    @Override
    public void resetDevice() {
        // Unused, but must implement it
    }

}
