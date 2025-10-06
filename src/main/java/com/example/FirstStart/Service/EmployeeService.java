package com.example.FirstStart.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FirstStart.Pojo.Employee;
import com.example.FirstStart.Repository.EmployeeRepository;

@Service
public class EmployeeService {

	private final EmployeeRepository employeeRepository;
 
	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	public Optional<Employee> getEmployeeById(Long id) {
		return employeeRepository.findById(id);

	}

	public Employee updateEmployee(Long id, Employee employee) {
		Optional<Employee> updateEmployee = employeeRepository.findById(id);
		if (updateEmployee.isPresent()) {
			Employee updemployee = updateEmployee.get();
			
			
			updemployee.setId(employee.getId());
			updemployee.setName(employee.getName());
			updemployee.setFathername(employee.getFathername());
			updemployee.setMothername(employee.getMothername());
			updemployee.setCurrentaddress(employee.getCurrentaddress());
			updemployee.setTempopraryaddress(employee.getTempopraryaddress());
			updemployee.setState(employee.getState());
			updemployee.setCountry(employee.getCountry());
			updemployee.setEmail(employee.getEmail());
			updemployee.setAdharnumber(employee.getAdharnumber());
			updemployee.setPasspoartnumber(employee.getPasspoartnumber());
			return employeeRepository.save(updemployee);
		} else {
			throw new RuntimeException("Employee not Found");
		}
	}

	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}

	public void removeAllEmployees() {
		employeeRepository.deleteAll();
	}
}