package com.training.pms.galaxe.controller;

import lombok.Data;

@Data
public class Employee {
 int employeeId;
 String employeeName;
 int salary;
 int pf;
 int bonus;
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + ", pf=" + pf
			+ ", bonus=" + bonus + "]";
}
 
}
