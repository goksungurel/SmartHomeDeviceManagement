public class SmartLight extends SmartDevice implements Connectable,Schedulable {
    private int brightness;
    private boolean connected;
    private String scheduledTime;


    public SmartLight( String deviceName, boolean isOn, String location,int brightness) {
        super(deviceName, isOn, location);

        this.brightness = brightness;
        this.connected = false;
        this.scheduledTime = "";
    }
    public void setBrightness(int brightness){
        this.brightness = brightness;
    }
    public int getBrightness(){
        return this.brightness;
    }
    public double calculateEnergyUsage(){
        return brightness * 0.05;
    }
    public void connectToWifi(String networkName){
        connected=true;
        System.out.println(getDeviceName() + " connected to " + networkName);
    }
    public boolean isConnected(){
        return connected;

    }
    public void scheduleTask(String time){
        scheduledTime = time;
    }
    public String getScheduledTime(){
        return scheduledTime;
    }
    public void printStatus(){
        super.printStatus();
        System.out.println("Brightness: " + brightness);
        System.out.println("Connected: " + connected);
        System.out.println("Scheduled Time: " + scheduledTime);

    }
}
