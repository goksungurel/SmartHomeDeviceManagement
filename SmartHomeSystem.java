import java.util.ArrayList;
public class SmartHomeSystem {
    private ArrayList<SmartDevice>devices;

    public SmartHomeSystem() {
        devices = new ArrayList<>();
    }
    public void addDevice(SmartDevice device){
        if(!devices.contains(device)){
            devices.add(device);
            System.out.println(device.getDeviceName() + " added to the system.");
        }
    }
    public void removeDevice(SmartDevice device){
        if(devices.contains(device)){
            devices.remove(device);
        }else{
            System.out.println("Device not found.");

        }
    }

    public void printAllDevices(){
        System.out.println("All smart devices");
        for(SmartDevice device : devices){
            device.printStatus();
        }
    }
    public void generateEnergyReport(){
        System.out.println("Generating energy report");
        double totalEnergy = 0;

        for(SmartDevice device : devices){
            double energy =device.calculateEnergyUsage();
            System.out.println(device.getDeviceName() + ": " + energy + " kWh");
            totalEnergy += energy;
        }
        double average=devices.size()>0 ? totalEnergy/devices.size() : 0;
        System.out.println("Total Energy Usage: " + totalEnergy + " kWh");
        System.out.println("Average Energy Usage: " + average + " kWh");
    }
}
