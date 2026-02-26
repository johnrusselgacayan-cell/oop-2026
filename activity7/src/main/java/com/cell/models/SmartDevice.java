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

    public void displayStatus() {
        String status = isOn ? "ON" : "OFF";
        System.out.println(deviceName + " is currently " + status);
    }
}
