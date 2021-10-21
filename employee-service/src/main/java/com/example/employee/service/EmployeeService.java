package com.example.employee.service;

import com.example.employee.entity.Employee;
import com.example.employee.repository.EmloyeeRepository;
import com.example.employee.vo.Department;
import com.example.employee.vo.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmloyeeRepository employeeRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public EmployeeResponse getById(Long employeeId) {
        EmployeeResponse employeeResponse = new EmployeeResponse();
        Employee employee = employeeRepository.findById(employeeId).get();
        employeeResponse.setEmployee(employee);
        /*DEPARTMENT-SERVICE is the name of service in Eureka Registry*/
        //Without API Gateway
//        Department department = restTemplate.
//                getForObject("http://DEPARTMENT-SERVICE/department/"+employee.getDepartmentId(), Department.class);
        //With API Gateway.
        Department department = restTemplate.
                getForObject("http://localhost:8550/department/"+employee.getDepartmentId(), Department.class);

        employeeResponse.setDepartment(department);
        return employeeResponse;
    }
}
