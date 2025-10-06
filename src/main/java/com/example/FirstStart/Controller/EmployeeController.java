package com.example.FirstStart.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.FirstStart.Pojo.Employee;
import com.example.FirstStart.Service.EmployeeService;

@RestController
@RequestMapping("/global")
public class EmployeeController {
	private final EmployeeService employeeService;
   
	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;

	}

	@PostMapping("/saveEmployee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		Employee saveEmployee = employeeService.saveEmployee(employee);

		return ResponseEntity.ok(saveEmployee);

	} 

	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();

	}

	@GetMapping("/getEmployee/{id}")
	public ResponseEntity<Employee> getById(@PathVariable Long id) {
		Optional<Employee> getEmployee = employeeService.getEmployeeById(id);
		return getEmployee.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}

	@PutMapping("/updateEmployee")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee, @PathVariable Long id) {
		Employee updateEmployee = employeeService.updateEmployee(id, employee);
		return ResponseEntity.ok(updateEmployee);

	}

}
