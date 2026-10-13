package com.example.employee;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.example.employee.EmployeeService.addEmployee(..))")
    public void logBeforeAddingEmployee() {
        System.out.println("Logging: Adding employee");
    }

    @Before("execution(* com.example.employee.EmployeeService.displayEmployeeDetails(..))")
    public void logBeforeDisplayingEmployee() {
        System.out.println("Logging: Displaying employee");
    }

    @Before("execution(* com.example.employee.EmployeeService.calculateSalary(..))")
    public void logBeforeCalculatingSalary() {
        System.out.println("Logging: Calculating salary");
    }
}
