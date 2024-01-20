package collection;
import java.util.*;
public class Example {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("nikita");
		name.add("suresh");
		name.remove("suresh");
		name.add(0, "aadarsha");
		for(String s: name) {
			System.out.println(s);
		}
		
		
		//HashSet<Integer> score = new HashSet<Integer>();
		//score.add(10);
		//same thing //not index
		
		HashMap<String, Integer> score= new HashMap<String, Integer>();
		score.put("nikita", 80);
		score.put("suresh", 88);
		//remove
		System.out.println(score.containsKey("nikita"));
		System.out.println(score.containsValue("nikita"));
		//System.out.println(score.keySet());  
		
		Set<String> allKeys = score.keySet();
		for(String s :allKeys) {
			System.out.println(s);
			System.out.println(score.get(s));
		}
		
		
		
;		
	}
}//dulication
//ArrayList dont need extra code as it allows duplication
//Hashset need extra code
//hashmap<integer, student> no extra code needed because key can have duplicates
//sort
//compareTo method: arraylist (dont need) because its not sorted
//set - TreeSet need compare
// map key- sorted
//map value - not sorted

//array supports primitive and object data type
//collection support only onject hence all the primitive data tye have wrapper class
// primitive data type - has a single data and cannot do anything
//object data type - can have multiple data and can do lots of things
//int a = 10;
/*public class student :
	string name = "john";
	 int grade= 20;
	 public void lear() {
		 
	 }
	 }*/