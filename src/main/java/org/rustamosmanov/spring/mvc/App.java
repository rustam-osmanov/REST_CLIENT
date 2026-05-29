package org.rustamosmanov.spring.mvc;

import org.rustamosmanov.spring.mvc.configuration.MyConfig;
import org.rustamosmanov.spring.mvc.entity.EmployeeBD;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
        System.out.println("getAllEmployees");
        List<EmployeeBD> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);
        System.out.println("------------------------------------------------------");
        System.out.println("------------------------------------------------------");
        System.out.println("getEmployeeById 3");
        EmployeeBD employeeBD = communication.getEmployeeById(3);
        System.out.println(employeeBD);
        System.out.println("------------------------------------------------------");
        System.out.println("------------------------------------------------------");
        System.out.println("saveEmployee");
        employeeBD.setName(employeeBD.getName()+"Api");
        System.out.println("------------------------------------------------------");
        System.out.println("------------------------------------------------------");
        System.out.println("NEW saveEmployee");
        employeeBD = new EmployeeBD("APINAME","APISUR","API",1500);
        communication.saveEmployee(employeeBD);
        System.out.println(employeeBD);
        System.out.println("------------------------------------------------------");
        System.out.println("------------------------------------------------------");
        System.out.println("deleteEmployee");
        communication.deleteEmployee(17);
        System.out.println("------------------------------------------------------");
        System.out.println("------------------------------------------------------");

    }
}
