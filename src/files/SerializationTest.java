package files;

import java.io.FileInputStream;
import java.io.ObjectOutputStream;


import java.io.*;
import java.util.Scanner;

public class SerializationTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Student s = new Student();
		//System.out.println(s.name);
		//System.out.println(s.age);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String name = sc.nextLine();
		System.out.println("enter your age");
		int age = sc.nextInt();
		
		s.name = name;
		s.age = age;
		
		System.out.println(s.name);
		System.out.println(s.age);
		
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\Users\\anjil\\hello.txt"));

		os.writeObject(s);
		System.out.println("the object has been created");
		os.close();

	}

}
