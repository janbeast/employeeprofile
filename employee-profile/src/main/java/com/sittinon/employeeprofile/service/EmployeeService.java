package com.sittinon.employeeprofile.service;

import com.sittinon.employeeprofile.entity.Employee;
import com.sittinon.employeeprofile.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }

    public List<Employee> getemployeeAll() {
        List<Employee> employeelist = employeeRepository.findAll();
        return  employeelist;
    }

    public Employee getEmployee(long id) {
        return employeeRepository.findById(id);
    }

}
