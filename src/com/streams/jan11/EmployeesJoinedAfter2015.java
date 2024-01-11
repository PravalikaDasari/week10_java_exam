package com.streams.jan11;

import java.util.List;

public class EmployeesJoinedAfter2015
{
	public static void main(String[] args)
	{
		EmployeeList employeeList = EmployeeList.getObject();
		List<Employee> list = employeeList.getEmployeeList();
		
		list.stream()
		.filter(e->e.getYearOfJoining()>2015)
		.map(Employee::getName)
		.forEach(System.out::println);
	}
}
