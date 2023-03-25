package com.cvds.lab7.cvds_lab7.repository;

import com.cvds.lab7.cvds_lab7.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
