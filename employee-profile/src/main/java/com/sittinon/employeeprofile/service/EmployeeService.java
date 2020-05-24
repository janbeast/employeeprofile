package com.sittinon.employeeprofile.service;

import com.sittinon.employeeprofile.entity.Employee;
import com.sittinon.employeeprofile.model.Result;
import com.sittinon.employeeprofile.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

//    public void saveEmployee(Employee employee) {
//        employeeRepository.save(employee);
//    }

    public Result saveEmployee(Employee employee) {
        Result result = new Result();
        try {
            employeeRepository.save(employee);
            result.setStatus("T");
            result.setDescription("SUCCESS");
            return result;
        } catch (Exception e) {
            result.setStatus("F");
            result.setDescription("ERROR: " + e.getMessage());
            return result;
        }
    }

//    public void deleteEmployee(long id) {
//        employeeRepository.deleteById(id);
//    }

    public Result deleteEmployee(long id) {
        Result result = new Result();
        try {
            employeeRepository.deleteById(id);
            result.setStatus("T");
            result.setDescription("SUCCESS");
            return result;
        } catch (Exception e) {
            result.setStatus("F");
            result.setDescription("ERROR: " + e.getMessage());
            return result;
        }
    }

//    public List<Employee> getemployeeAll() {
//        List<Employee> employeelist = employeeRepository.findAll();
//        return employeelist;
//    }

    public List<Employee> getEmployeeAll() {
        try {
            List<Employee> employeeList = employeeRepository.findAll();
            return employeeList;
        } catch (Exception e) {
            return null;
        }
    }

//    public Employee getEmployee(long id) {
//        return employeeRepository.findById(id);
//    }

    public Employee getEmployee(long id) {
        try {
            Employee employee = employeeRepository.findById(id);
            return employee;
        } catch (Exception e) {
            return null;
        }
    }


//    public Page<Employee> getEmployeePaging(int page, int size) {
//        Pageable pageable = PageRequest.of(page, size);
//        return employeeRepository.findAll(pageable);
//    }

    public Page<Employee> getEmployeePaging(int page, int size) {
        try {
            Pageable pageable = PageRequest.of(page, size);
            return employeeRepository.findAll(pageable);
        } catch (Exception e) {
            return null;
        }
    }

    public List<Employee> getEmployeeByName(String name) {
        try {
            List<Employee> employee = employeeRepository.findByNameContainingIgnoreCase(name);
            return employee;

        } catch (Exception e){
            return null;
        }
    }

}
