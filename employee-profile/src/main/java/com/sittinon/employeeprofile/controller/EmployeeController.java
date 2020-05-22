package com.sittinon.employeeprofile.controller;

import com.sittinon.employeeprofile.entity.Employee;
import com.sittinon.employeeprofile.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/saveemp")
    private String saveEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return "Success";
    }

    @PostMapping("/deleteemp")
    private String deleteEmployee(@RequestBody long id) {
        employeeService.deleteEmployee(id);
        return "Delete Success";
    }

    @GetMapping("/getemployeeall")
    private List<Employee> getemployeeAll(){
        return employeeService.getemployeeAll();
    }

    @GetMapping("/getemployee/{id}")
    private Employee getEmployee(@PathVariable long id){
        return employeeService.getEmployee(id);
    }


}
