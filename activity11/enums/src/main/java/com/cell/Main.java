package com.cell;

import java.util.ArrayList;
import java.util.Scanner;

import com.cell.models.Employee;
import com.cell.models.FileHandler;
import com.cell.models.HourlyEmployee;
import com.cell.models.SalariedEmployee;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n==== Payroll System ====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Save Records");
            System.out.println("4. Load Records");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Choose type (1 = Salaried, 2 = Hourly): ");
                    int typeChoice = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();

                    if (typeChoice == 1) {
                        System.out.print("Base Salary: ");
                        double base = sc.nextDouble();

                        System.out.print("Bonus: ");
                        double bonus = sc.nextDouble();

                        employees.add(new SalariedEmployee(name, id, base, bonus));

                    } else if (typeChoice == 2) {
                        System.out.print("Hours Worked: ");
                        int hours = sc.nextInt();

                        System.out.print("Hourly Rate: ");
                        double rate = sc.nextDouble();

                        employees.add(new HourlyEmployee(name, id, hours, rate));
                    }

                    System.out.println("Employee added!");
                    break;

                case 2:
                    if (employees.isEmpty()) {
                        System.out.println("No employees found.");
                    } else {
                        for (Employee emp : employees) {
                            System.out.println(emp);
                        }
                    }
                    break;

                case 3:
                    FileHandler.save(employees);
                    break;

                case 4:
                    employees = FileHandler.load();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}