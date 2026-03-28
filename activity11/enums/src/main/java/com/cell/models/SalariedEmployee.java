package com.cell.models;

public class SalariedEmployee extends Employee{
    private double baseSalary;
    private double bonus;

    public SalariedEmployee(String name, String employeeId, double baseSalary, double bonus) {
        super(name, employeeId, EmployeeType.SALARIED);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateEarnings() {
        return baseSalary + bonus;
    }

    @Override
    public String toString() {
        return String.format("SalariedEmployee{name='%s', employeeId='%s', type=%s, baseSalary=%.2f, bonus=%.2f}", 
                getName(), getEmployeeId(), getType(), baseSalary, bonus);
    }
}
    
    
