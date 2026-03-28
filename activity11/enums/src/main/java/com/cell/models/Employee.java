package com.cell.models;

public abstract class Employee {
    private String name;
    private String employeeId;
    protected EmployeeType type;
    
    public Employee(String name, String employeeId, EmployeeType type) {
        this.name = name;
        this.employeeId = employeeId;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public EmployeeType getType() {
        return type;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }

    public abstract double calculateEarnings();

    @Override
    public String toString() {
        return String.format("Employee{name='%s', employeeId='%s', type=%s}", name, employeeId, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (!name.equals(employee.name)) return false;
        if (!employeeId.equals(employee.employeeId)) return false;
        return type == employee.type;
    }
    
}
