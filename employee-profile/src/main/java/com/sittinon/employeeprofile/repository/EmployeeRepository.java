package com.sittinon.employeeprofile.repository;

import com.sittinon.employeeprofile.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findAll();

    Employee findById(long id);

    Page<Employee> findAll(Pageable pageable);

    List<Employee> findByNameContainingIgnoreCase(String name);

}
