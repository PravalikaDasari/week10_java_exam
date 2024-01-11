package com.streams.jan11;

import java.util.List;
import java.util.stream.Collectors;

public class NamesOfEmployees 
{
	public static void main(String[] args)
	{
		EmployeeList employeeList = EmployeeList.getObject();
		List<Employee> list = employeeList.getEmployeeList();
		
		list.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment))
		.entrySet()
		.forEach((e)->{
			System.out.println(e.getKey());
			e.getValue().stream().forEach((emp)->System.out.println(emp.getName()));
			System.out.println();
		});
	}
}
