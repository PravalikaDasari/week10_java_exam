package com.streams.jan11;

import java.util.List;
import java.util.stream.Collectors;

public class MaleAndFemaleCount 
{
	public static void main(String[] args) 
	{
		EmployeeList employeeList = EmployeeList.getObject();
		List<Employee> list = employeeList.getEmployeeList();
		
		//male and female count
		list.stream()
		.collect(Collectors.groupingBy(Employee::getGender , Collectors.counting()))
		.entrySet().forEach(System.out::println);
	}
}
