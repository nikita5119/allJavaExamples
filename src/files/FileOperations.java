package files;
import java.io.*;
public class FileOperations  {

	public static void main(String[] args) throws Exception {
		String fileCompletePath = "C:\\Users\\anjil\\hello.txt";
		File createf = new File(fileCompletePath);
		if (createf.exists() == false) {
			createf.createNewFile();
			System.out.println("create file" + fileCompletePath);
			if(createf.isDirectory()) {
				System.out.println("created action is of type folder");
			
			}
			else {
				System.out.println("created action is of type file");
			}
			
		}
		
		
		/*File deletef= new File (fileCompletePath);
		if(deletef.exists()) {
			deletef.delete();
			System.out.println("file deleted" + fileCompletePath);
		}*/
		
		
		String fileContent ="hello i am learning how to write in file using java";
		File writef = new File(fileCompletePath);
		if(!writef.exists()) {
			writef.createNewFile();
		}
		File f = new File("C:\\Users\\anjil\\writing.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("helko");
		bw.write("\n i am fine");
		bw.close();
		
		File f1=new File("C:\\Users\\anjil\\writing.txt");
		FileReader fr= new FileReader(f1); // initialize filereader object with file path		
		BufferedReader readFile = new BufferedReader(fr); 
		//	BufferedReader reader = new BufferedReader(new FileReader(fileCompletePath)); 
		//BufferedReader reader = new BufferedReader(readFile); // this wrapper class allows us to read text content line by line
		System.out.println("reading the file ");
		String line = readFile.readLine();		// the first line is copied in a string 
	    while (line  != null) {					// if the line is not null enter the loop and print
	    	System.out.println(line);
	        line = readFile.readLine();
	        
		
		

	}
	    readFile.close();
}
}
