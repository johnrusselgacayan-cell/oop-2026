package com.cell.models;

public class SmartLight extends SmartDevice {
    private int brightness = 100;

    public SmartLight(String deviceName, boolean isOn) {
        super(deviceName, isOn);
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
    }

    public void setBrightnessLevel(int level) {
        if (level > 100) {
            System.out.println("Brightness level must be 100 below.");
            return;
        }
        this.brightness = level;
        System.out.println("Brightness set to " + brightness);
    }
}
