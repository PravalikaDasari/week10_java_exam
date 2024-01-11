package com.streams.jan11;

import java.util.List;

public class EmployeeExistOrNot 
{
	public long isExist(String name)
	{
		EmployeeList employeeList = EmployeeList.getObject();
		List<Employee> list = employeeList.getEmployeeList();
		
		long count = list.stream()
		.filter(e->name.equals(e.getName()))
		.map(e->e.getName())
		.distinct()
		.count();
		return count;		
	}
	
}
