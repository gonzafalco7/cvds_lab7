package com.cvds.lab7.cvds_lab7.model;

import jakarta.persistence.*;

import java.time.*;

import java.util.Objects;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;
    private String firstName;
    private String lastName;
    private String role;
    private Double salary;
    private LocalDate nacimiento;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String role, Double salary, LocalDate nacimiento) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.salary = salary;
        this.nacimiento = nacimiento;
    }
    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public LocalDate getNacimiento() { return nacimiento; }

    public void setNacimiento(LocalDate nacimiento) { this.nacimiento = nacimiento; }

    public int calcularEdad()
    {
        LocalDate hoy = LocalDate.now();
        int añoNacimiento = nacimiento.getYear();
        int añoActual = hoy.getYear();
        int edad = añoActual - añoNacimiento;
        if (nacimiento.getDayOfYear() > hoy.getDayOfYear())
            edad--;
        return edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId.equals(employee.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                ", nacimiento=" + nacimiento +
                '}';
    }
}
