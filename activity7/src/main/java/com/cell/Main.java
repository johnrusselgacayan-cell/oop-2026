package com.cell;

import com.cell.models.SmartLight;
import com.cell.models.SmartThermostat;

public class Main {
    public static void main(String[] args) {
        
        SmartLight livingRoomLight = new SmartLight("Living Room Light", false);
        livingRoomLight.setBrightnessLevel(80);
        livingRoomLight.setOn(true);
        livingRoomLight.displayStatus();

        SmartThermostat homeThermostat = new SmartThermostat("Thermostat", true, 0);
        homeThermostat.setTemperatureLevel(32);
        homeThermostat.displayStatus();


    }
}