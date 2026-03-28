package com.cell.models;

import com.google.gson.*;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;

import java.lang.reflect.Type;
import java.util.*;
import java.io.*;

public class FileHandler{
    public static Gson getGson(){
        RuntimeTypeAdapterFactory<Employee> adapter = RuntimeTypeAdapterFactory
            .of(Employee.class, "type")
            .registerSubtype(SalariedEmployee.class, EmployeeType.SALARIED.name())
            .registerSubtype(HourlyEmployee.class, EmployeeType.HOURLY.name());

        Gson gson = new GsonBuilder().registerTypeAdapterFactory(adapter).create();
        return gson;

    }

    public static void save(ArrayList<Employee> employees){
        
        try (FileWriter writer = new FileWriter("employees.json")) {
            getGson().toJson(employees, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }    
    }

    public static ArrayList<Employee> load(){
        try (FileReader reader = new FileReader("employees.json")) {
            Type employeeListType = new com.google.gson.reflect.TypeToken<ArrayList<Employee>>(){}.getType();
            ArrayList<Employee> employees = getGson().fromJson(reader, employeeListType);
            return employees;
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
