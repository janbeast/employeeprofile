package com.sittinon.employeeprofile.repository;

import com.sittinon.employeeprofile.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Long>{
    List<Employee> findAll();
    Employee findById(long id);
}
