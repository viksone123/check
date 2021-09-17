package com.example.practice.Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.Repository.EmployeeRepository;
import com.example.practice.model.Employee;

@Service
public class EmployeeService {
	@Autowired
	public EmployeeRepository emprepo;

	public List<Employee> getAllEmployee() {
		List<Employee> employee = new ArrayList<>();
		//dont use forEach it'll drop performance

		//reassigin the values
		//emprepo.findAll().forEach(employee::add);
		return employee;
	}

	public void addEmployee(Employee employee) {
		//reassigin the values object mapping is required (dont use object builder for mapping)
		//emprepo.save(employee);
	}

	public void updateEmployee(String id, Employee employee) {
		emprepo.updateAddressById(id,employee.getAddress());
	}

	public void updateEmployee1(Employee employee) {
		emprepo.updateAddressById(employee.getEmpId(),employee.getAddress());
	}

	public void deleteEmployee(String id) {
		//reimplement same like updateAddressById
		//emprepo.deleteById(id);
	}
}
