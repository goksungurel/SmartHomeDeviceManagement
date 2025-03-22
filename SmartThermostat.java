public class SmartThermostat extends SmartDevice implements Connectable {
    private double temperatureSetting;
    private boolean connected;

    public SmartThermostat(String deviceName, boolean isOn, String location, double temperatureSetting) {
        super(deviceName, isOn, location);
        this.temperatureSetting = temperatureSetting;
        this.connected = false;
    }
    public void setTemperatureSetting(double temperatureSetting) {
        this.temperatureSetting = temperatureSetting;
    }
    public double getTemperatureSetting() {
        return temperatureSetting;
    }
    public double calculateEnergyUsage(){
        return temperatureSetting * 0.2 + 1.5;
    }
    public void connectToWifi(String networkName) {
        connected = true;
        System.out.println(getDeviceName() + " connected to WiFi: " + networkName);
    }
    public boolean isConnected() {
        return connected;
    }
    public void printStatus() {
        super.printStatus();
        System.out.println("Temperature Setting: " + temperatureSetting);
        System.out.println("Connected: " + connected);
    }

}
