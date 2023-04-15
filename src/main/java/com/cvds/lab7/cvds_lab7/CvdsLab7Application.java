package com.cvds.lab7.cvds_lab7;

import com.cvds.lab7.cvds_lab7.model.Employee;
import com.cvds.lab7.cvds_lab7.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class CvdsLab7Application {

	@Autowired
	EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(CvdsLab7Application.class, args);
	}

	@Bean
	public CommandLineRunner run() throws Exception {
		return (args) -> {
			employeeService.deleteAllEmployees();
			System.out.println("");
			System.out.println(new String(new char[80]).replace("\0", "="));
			System.out.println("");
			Employee yo = employeeService.addEmployee(new Employee("Gonzalo", "Falco", "Student", 1160000.00, LocalDate.of(1600, 10, 26)));
			System.out.println(yo);
			System.out.println("La edad del empleado es " + yo.calcularEdad());
			System.out.println("");
			System.out.println(new String(new char[80]).replace("\0", "="));
			System.out.println("");
		};
	}
}