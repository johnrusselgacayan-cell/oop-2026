package com.cell.models;

public class SmartDevice {
    private String deviceName;
    private boolean isOn;
    
    public SmartDevice(String deviceName, boolean isOn) {
        this.deviceName = deviceName;
        this.isOn = isOn;
    }
    
    public String getDeviceName() {
        return deviceName;
    }
    
    public boolean isOn() {
        return false;
    }
    
    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public void togglePower() {
        this.isOn = !this.isOn;
    }

    public void displayStatus() {
        System.out.println(deviceName);
        System.out.println(isOn ? "On" : "Off");
    }
}
