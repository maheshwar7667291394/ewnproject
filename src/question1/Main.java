package question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<Student> student=new ArrayList<>();
		student.add(new Student("mahsh",34,390));
		student.add(new Student("ramukaka",23,450));
		student.add(new Student("kumar gupata",234,100));
		Collections.sort(student,(s1,s2)->s1.getMarks()>s2.getMarks()?+1:-1);
		for(Student item:student) {
			System.out.println(item.getName());
			System.out.println("===========");
		}
		
		}

}
