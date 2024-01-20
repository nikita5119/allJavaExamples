package collection;
import java.util.*;
public class arrayListExample {
	public static void main(String[] args) {
		ArrayList <String> name= new ArrayList<String>();
		name.add("john");
		name.add("jane");
		name.add("mike");
		name.add("john");
		name.add("ron");
		name.remove(1);
		System.out.println(name);
		}
}
