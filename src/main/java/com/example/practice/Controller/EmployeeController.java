package com.example.practice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.Service.EmployeeService;
import com.example.practice.model.Employee;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empser;

	//try to add all the requesting in 1 request object only

	//don't keep void as return it won't return anything
	//rather than void use "ResponseEntity<String>" which helps in response status creation

	@RequestMapping("/employee")
	public List<Employee> getAllEmployee() {
		return empser.getAllEmployee();	
	}

	@RequestMapping(method = RequestMethod.POST, value = "/employee")
	public void addEmployee(@RequestBody Employee employee) {
		empser.addEmployee(employee);

	}

	//changed to request header
	@RequestMapping(method = RequestMethod.PUT, value = "/employee{id}")
	public void updateEmployee(@RequestHeader String id, @RequestBody Employee employee) {
		empser.updateEmployee(id, employee);

	}

	//re-implementing updateAddressById without seperate id variable
	@RequestMapping(method = RequestMethod.PUT, value = "/employee{id}")
	public void updateEmployee1(@RequestBody Employee employee) {
		empser.updateEmployee1(employee);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/employee{id}")
	public void deleteEmployee(@PathVariable String id) {
		empser.deleteEmployee(id);
	}

}
