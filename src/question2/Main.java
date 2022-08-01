package question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import question1.Student;

public class Main {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any name");
		String name=input.next();
		System.out.println(name);
		List<Student> student=new ArrayList<>();
		student.add(new Student("mahsh",34,390));
		student.add(new Student("ramukaka",23,450));
		student.add(new Student("kumar gupata",234,100));

		List<Employee> emp=student
		.stream()

		.map(item->{
			return new Employee(item.getName(),item.getRoll(),item.getMarks()*1000);
		})
		.collect(Collectors.toList());
		
		
		for(Employee ite:emp) {
			System.out.println(ite.getName());
			System.out.println(ite.getSalary());
			System.out.println("============");
		}
		
		}
	
	

}
