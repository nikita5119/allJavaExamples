package ExceptionHandling;

import java.io.*;

public class exceptionTest {

	public void method1() {
		System.out.println("hello 1");
		try {
		method2();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		}
	public void method2() throws IOException
	{
		System.out.println("hello 2");
		method3();
		}
	public void method3() throws IOException
	{
		System.out.println("hello 3");
		File f = new File("p:/tesyt.txt");
		f.createNewFile();		}
	
}
