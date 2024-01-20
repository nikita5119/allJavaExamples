package stringExample;

public class ExampleOfString {

	public static void main(String[] args) {
		String name = "Nikita Bajracharya";
		System.out.println(name.charAt(1));
		System.out.println(name.concat("suresh"));
		System.out.println(name.contains("i"));
		System.out.println(name.indexOf("i"));

		String[] temp= name.split(" ");
		System.out.println(temp[0]);
		
		

	}

}
