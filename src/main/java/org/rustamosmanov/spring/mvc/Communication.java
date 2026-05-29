package org.rustamosmanov.spring.mvc;

import org.rustamosmanov.spring.mvc.entity.EmployeeBD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Component
public class Communication {
    @Autowired
    private RestTemplate restTemplate;

    private final String URL = "http://localhost:8080/REST_API/api/employees";

    public List<EmployeeBD>  getAllEmployees() {
        ResponseEntity<List<EmployeeBD>> response = restTemplate.exchange(URL,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<EmployeeBD>>() {});
        List<EmployeeBD> employees = response.getBody();
        return employees;
    }

    public EmployeeBD getEmployeeById(int id) {
        EmployeeBD employee = restTemplate.getForObject(URL + "/" + id, EmployeeBD.class);
        return employee;
    }
    public void saveEmployee(String name) {

    }

    public void deleteEmployee(int id) {

    }
}
