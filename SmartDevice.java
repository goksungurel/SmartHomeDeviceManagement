public abstract  class SmartDevice {
    private String deviceName;
    private boolean isOn;
    private String location;

    public SmartDevice(String deviceName, boolean isOn, String location) {
        this.deviceName = deviceName;
        this.isOn = isOn;
        this.location = location;
    }
    public String getDeviceName() {
        return deviceName;
    }
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    public boolean isOn() {
        return isOn;
    }
     public void turnOn() {
        this.isOn = isOn;

     }
     public void turnOff(){
        this.isOn = false;
     }
     public String getLocation(){
        return location;
     }
     public void setLocation(String location){
        this.location = location;
     }
     public void printStatus(){
         System.out.println("Device: " + deviceName);
         System.out.println("Status: " + (isOn ? "ON" : "OFF"));
         System.out.println("Location: " + location);
     }
     public abstract double calculateEnergyUsage();


}
