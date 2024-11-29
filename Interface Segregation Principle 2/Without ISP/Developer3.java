// Class implementing configuration-related functions
class Developer3 implements IConfigurationDriver {
    @Override
    public void setIPAddress(String ip) {
        System.out.println("Setting IP address to: " + ip);
    }
}