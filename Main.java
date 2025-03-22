public class Main {
    public static void main(String[] args) {
        SmartHomeSystem home = new SmartHomeSystem();

        SmartLight light =new SmartLight("Living Room Light",false,"Living Room",80);
        light.turnOn();
        light.connectToWifi("HomeNetwork");
        light.scheduleTask("20:00");
        SmartThermostat thermostat =new SmartThermostat("Bedroom Thermostat",false,"Thermostat",80);
        thermostat.connectToWifi("HomeNetwork");
        SmartVacuum vacuum = new SmartVacuum("Robot Vacuum", false, "Hallway", 30.0);
        vacuum.turnOn();
        vacuum.scheduleTask("14:00");

        home.addDevice(light);
        home.addDevice(thermostat);
        home.addDevice(vacuum);


        home.printAllDevices();


        home.generateEnergyReport();
    }
}
