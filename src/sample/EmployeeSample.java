package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSample {
	public static void main(String[] args) {
		List<Employee> list =new ArrayList<Employee>();
		Employee e =new Employee();
		e.setId("one");
		e.setName("a");
		
		Employee e1 =new Employee();
		e1.setId("one");
		e1.setName("a");
		
		list.add(e);
		list.add(e1);
		
		List<Employee> list1 = list.stream().distinct().collect(Collectors.toList());
		//System.out.println(list1);
		
		System.out.println(e.equals(e1));
	}

}
