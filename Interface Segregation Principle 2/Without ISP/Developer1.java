// Class implementing network-related functions
class Developer1 implements INetworkDriver {
    @Override
    public void sendData(String data) {
        System.out.println("Sending data: " + data);
    }

    @Override
    public void receiveData() {
        System.out.println("Receiving data...");
    }
}
