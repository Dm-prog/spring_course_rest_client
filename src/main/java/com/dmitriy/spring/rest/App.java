package com.dmitriy.spring.rest;

import com.dmitriy.spring.rest.configuration.MyConfig;
import com.dmitriy.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee employee = communication.getEmployee(10);
//        System.out.println(employee);

//        Employee employee = new Employee(
//                "Ekatherina", "Kotova", "HR", 1200);
//        employee.setId(17);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(17);
    }
}
