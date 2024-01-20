package files;

import java.io.*;
public class Deserialzation {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	
	ObjectInputStream os = new ObjectInputStream(new FileInputStream("C:\\Users\\anjil\\hello.txt"));
	Student s = (Student) os.readObject();
	System.out.println(s.name);
	System.out.println(s.age);
	
	
	
	}
	}
