package com.streams.jan11;

import java.util.List;
import java.util.stream.Collectors;

public class MaleAndFemaleCountInSalesAndMarketing 
{
	public static void main(String[] args)
	{
		EmployeeList employeeList = EmployeeList.getObject();
		List<Employee> list = employeeList.getEmployeeList();
		
		list.stream()
		.filter(e->"Sales".equals(e.getDepartment()) || "Marketing".equals(e.getDepartment()))
		.collect(Collectors.groupingBy(Employee::getGender , Collectors.counting()))
		.entrySet()
		.forEach(System.out::println);
	}
}
