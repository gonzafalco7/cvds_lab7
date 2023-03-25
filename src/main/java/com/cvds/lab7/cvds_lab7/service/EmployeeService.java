package com.cvds.lab7.cvds_lab7.service;

import com.cvds.lab7.cvds_lab7.model.Employee;
import com.cvds.lab7.cvds_lab7.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployee(Long employeeId) {
        return employeeRepository.findById(employeeId).get();
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        if(employeeRepository.existsById(employee.getEmployeeId())) {
            return employeeRepository.save(employee);
        }

        return null;
    }

    public void deleteEmployee(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
