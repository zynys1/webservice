package org.warehouse.webservice.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.warehouse.webservice.entity.Employee;
import org.warehouse.webservice.repository.EmployeeRepository;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {


	@Autowired
	EmployeeRepository employeeRepository;

	// insert (POST) new employee into database
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee) {

		return employeeRepository.save(employee);
	}

	// fetch (GET) all employees list from database
	@GetMapping("/all")
	public Iterable<Employee> allEmployee() {

		return employeeRepository.findAll();
	}

	// fetch (GET) specific employee by their ID
	@GetMapping("/{EmployeeID}")
	public Optional<Employee> employeeById(@PathVariable("EmployeeID") int EmployeeID) {

		return employeeRepository.findById(EmployeeID);
	}

	// update (PUT) existing country
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) {

		return employeeRepository.save(employee);
	}

	// delete (DELETE) employee from database
	@DeleteMapping("/{EmployeeID}")
	public void deleteEmployee(@PathVariable("EmployeeID") int employeeID) {

		employeeRepository.deleteById(employeeID);
	}
}