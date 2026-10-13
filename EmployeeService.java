package com.example.employee;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private Employee employee;

    public void addEmployee(int id, String name, double salary) {
        this.employee = new Employee(id, name, salary);
        System.out.println("Employee added: " + employee.name());
    }

    public void displayEmployeeDetails() {
        ensureEmployeeExists();
        System.out.println("Employee ID: " + employee.id());
        System.out.println("Employee Name: " + employee.name());
    }

    public void calculateSalary() {
        ensureEmployeeExists();
        System.out.println("Employee Salary: " + employee.salary());
    }

    private void ensureEmployeeExists() {
        if (employee == null) {
            throw new IllegalStateException("Add an employee before requesting employee details.");
        }
    }

    private record Employee(int id, String name, double salary) {
    }
}
