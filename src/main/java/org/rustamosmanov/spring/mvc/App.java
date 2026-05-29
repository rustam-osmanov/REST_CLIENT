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
        List<EmployeeBD> allEmployees = communication.getAllEmployees();

        System.out.println(allEmployees);
    }
}
