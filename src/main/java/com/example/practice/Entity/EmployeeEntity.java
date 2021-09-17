package com.example.practice.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class EmployeeEntity {

	
	//this is how entity class should add eachand every column seperately
	
	@Id
	@Column(name = "Employee_ID" , nullable = false)
	private String empId;

	@Column(name = "First_Name")
	private String fName;

//	@Id
//	private String empId;
//	private String fName;
	private String lName;
	private String startDate; // joining date
	private String endDate;
	private String department;
	private String pan;
	private String designation;
	private String dob;
	private String status;
	private String reportingManager;
	private String gender;
	private String bloddGroup;
	private String address;
	private String dependents;

	public EmployeeEntity() {

	}

	public EmployeeEntity(String empId, String fName, String lName, String startDate, String endDate, String department,
			String pan, String designation, String dob, String status, String reportingManager, String gender,
			String bloddGroup, String address, String dependents) {
		super();
		this.empId = empId;
		this.fName = fName;
		this.lName = lName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.department = department;
		this.pan = pan;
		this.designation = designation;
		this.dob = dob;
		this.status = status;
		this.reportingManager = reportingManager;
		this.gender = gender;
		this.bloddGroup = bloddGroup;
		this.address = address;
		this.dependents = dependents;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReportingManager() {
		return reportingManager;
	}

	public void setReportingManager(String reportingManager) {
		this.reportingManager = reportingManager;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloddGroup() {
		return bloddGroup;
	}

	public void setBloddGroup(String bloddGroup) {
		this.bloddGroup = bloddGroup;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDependents() {
		return dependents;
	}

	public void setDependents(String dependents) {
		this.dependents = dependents;
	}

}
