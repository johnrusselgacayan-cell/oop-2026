package com.cell.models;

public class SmartThermostat extends SmartDevice {
    private double temperature;

    public SmartThermostat(String deviceName, boolean isOn, double initialTemperature) {
        super(deviceName, isOn);
        this.temperature = initialTemperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temp) {
        this.temperature = temp;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
    }

    public void setTemperatureLevel(double temp) {
        if (temp > 30) {
            System.out.println("Temperature must be 30°C and below.");
            return;
        }
        this.temperature = temp;
        System.out.println("Temperature set to " + temperature + "°C");
    }
}
