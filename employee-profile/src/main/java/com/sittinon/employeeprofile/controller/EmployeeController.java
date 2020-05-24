package com.sittinon.employeeprofile.controller;

import com.sittinon.employeeprofile.entity.Employee;
import com.sittinon.employeeprofile.model.Result;
import com.sittinon.employeeprofile.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

//    @GetMapping("/hello")
//    ResponseEntity<String> hello() {
//        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
//    }
//
//    @GetMapping("/manual")
//    void manual(HttpServletResponse response) throws IOException {
//        response.setHeader("Custom-Header", "foo");
//        response.setStatus(200);
//        response.getWriter().println("Hello World!");
//    }

//    @PostMapping("/saveemp")
//    private String saveEmployee(@RequestBody Employee employee) {
//        employeeService.saveEmployee(employee);
//        return "Success";
//    }

    @PostMapping("/saveemp")
    private Result saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

//    @PostMapping("/deleteemp")
//    private String deleteEmployee(@RequestBody long id) {
//        employeeService.deleteEmployee(id);
//        return "Delete Success";
//    }

    @PostMapping("/deleteemp/{id}")
    private Result deleteEmployee(@PathVariable long id) {
        return employeeService.deleteEmployee(id);
    }

    @GetMapping("/getemployeeall")
    private List<Employee> getemployeeAll() {
        return employeeService.getEmployeeAll();
    }

    @GetMapping("/getemployee/{id}")
    private Employee getEmployee(@PathVariable long id) {
        return employeeService.getEmployee(id);
    }

    @RequestMapping(
            value = "/getemployeepaging",
            params = {"page", "size"},
            method = RequestMethod.GET
    )
    private Page<Employee> getEmployeePaging(@RequestParam("page") int page, @RequestParam("size") int size) {
        Page<Employee> employeePagingResponses = employeeService.getEmployeePaging(page, size);
        return employeePagingResponses;
    }


    @RequestMapping(value = "/getemployeebyname",params = {"name"},method = RequestMethod.GET)
    private List<Employee> searchEmployee(@RequestParam("name") String name){
        List<Employee> employee = employeeService.getEmployeeByName(name);
        return employee;
    }

}
