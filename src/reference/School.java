package reference;

public class School {

	public static void main(String[] args) {
		int age= 50;
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.age = 100;
		s2 = s1;
		
		System.out.println(s1.age);
		System.out.println(s2.age);

	}

}
