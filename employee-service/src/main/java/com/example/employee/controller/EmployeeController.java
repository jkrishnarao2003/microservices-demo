package com.example.employee.controller;

import com.example.employee.entity.Employee;
import com.example.employee.service.EmployeeService;
import com.example.employee.vo.EmployeeResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/")
    public Employee saveEmployee(@RequestBody Employee employee){
        log.info("saveEmployee");
        return employeeService.saveEmployee(employee);
    }
    @GetMapping("/")
    public List<Employee> getAllEmployees(){
        log.info("getAllEmployees");
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{employeeId}")
    public EmployeeResponse getById(@PathVariable("employeeId") Long employeeId){
        log.info("getById");
        return employeeService.getById(employeeId);
    }

}
