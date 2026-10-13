package com.example.employee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            EmployeeService employeeService = context.getBean(EmployeeService.class);
            employeeService.addEmployee(101, "Sathya", 25000.0);
            employeeService.displayEmployeeDetails();
            employeeService.calculateSalary();
        }
    }
}
