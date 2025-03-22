public class SmartVacuum extends SmartDevice implements Schedulable {
    private double roomSize;
    private String scheduledTime;

    public SmartVacuum(String deviceName, boolean isOn, String location, double temperatureSetting) {
        super(deviceName, isOn, location);
        this.roomSize = temperatureSetting;
        this.scheduledTime = "";
    }

    public void setRoomSize(double roomSize) {
        this.roomSize = roomSize;
    }

    public double getRoomSize() {
        return this.roomSize;
    }

    public String getScheduledTime() {
        return this.scheduledTime;
    }

    public void scheduleTask(String scheduledTime) {
        this.scheduledTime = scheduledTime;
        System.out.println(getDeviceName() + " scheduled time: " + scheduledTime);
    }

    public double calculateEnergyUsage() {
        return roomSize * 0.3;
    }

    public void printStatus() {
        super.printStatus();
        System.out.println("Room Size: " + roomSize + " m²");
        System.out.println("Scheduled Time: " + scheduledTime);
    }
}
