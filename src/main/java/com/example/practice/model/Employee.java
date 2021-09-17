package com.example.practice.model;

public class Employee {

	private String empId;
	private String fName;
	private String lName;
	private String startDate;
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
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fName=" + fName + ", lName=" + lName + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", department=" + department + ", pan=" + pan + ", designation="
				+ designation + ", dob=" + dob + ", status=" + status + ", reportingManager=" + reportingManager
				+ ", gender=" + gender + ", bloddGroup=" + bloddGroup + ", address=" + address + ", dependents="
				+ dependents + "]";
	}
}
