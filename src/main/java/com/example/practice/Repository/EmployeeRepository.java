package com.example.practice.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.practice.Entity.EmployeeEntity;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, String>{

	@Modifying
	@Query("UPDATE #{#entityName} e SET e.address = ?2 WHERE e.Employee_ID=?1")
	public List<EmployeeEntity> updateAddressById(String id, String address);
	
}
