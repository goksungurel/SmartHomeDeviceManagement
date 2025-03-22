interface Connactable {
    void connectToWifi(String networkName);
    boolean isConnected();
}

interface Connectable{
    void connectToWifi(String networkName);
    boolean isConnected();
}

interface Schedulable{
    void scheduleTask(String time);
    String getScheduledTime();
}
