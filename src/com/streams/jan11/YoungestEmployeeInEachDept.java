//Get the youngest employee details each department wise
package com.streams.jan11;

import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class YoungestEmployeeInEachDept 
{
	public static void main(String[] args)
	{
		EmployeeList employeeList = EmployeeList.getObject();
		List<Employee> list = employeeList.getEmployeeList();
		
		Set<Entry<String, List<Employee>>> entrySet = list.stream()
		.sorted(Comparator.comparing(Employee::getAge))
		.collect(Collectors.groupingBy(Employee::getDepartment))
		.entrySet();
		
		for(Entry<String, List<Employee>> entry :entrySet)
		{
			System.out.println(entry.getKey()+"--"+entry.getValue().stream().findFirst().orElseThrow());
		}
		
	}
}
