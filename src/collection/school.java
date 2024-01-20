package collection;
import java.util.*;
public class school {

	public static void main(String[] args) {
		//HashSet<student> school = new HashSet<student>();
		TreeSet<student> school = new TreeSet<student>();
		student s1 = new student("John", 1);
		student s2 = new student("Jane", 1);
		student s3 = new student("Mike", 5);
		student s4 = new student("Ron", 4);
		student s5 = new student("Ron", 4);
		school.add(s1);
		school.add(s2);
		school.add(s3);
		school.add(s4);
		school.add(s5);
		//System.out.println(school.size()); // no duplication but its giving me so write youtr own code <string> and <student> is my code
		System.out.println(school); 
		TreeSet<Integer> ex = new TreeSet<Integer>();
		ex.add(43);
		ex.add(100);
		ex.add(9778);
		ex.add(23);
		System.out.println(ex); 
		
	}

}
