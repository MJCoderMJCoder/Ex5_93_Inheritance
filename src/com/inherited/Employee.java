package com.inherited;

public class Employee {
	protected String name;
	protected double salary;
	protected String department;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "姓名：" + name + ", 基本工资：" + salary
				+ ", 部门：" + department;
	}
	
	
	
}
