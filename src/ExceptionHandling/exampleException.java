package ExceptionHandling;

public class exampleException {

	public static void main(String[] args) {
		try {
			int x =10;
			//int result = x/0;
			String example = "hello";
			System.out.println(example.charAt(8));
		}
		catch (Exception e){
			e.printStackTrace();
			System.out.println("Dont do that");
			
		}
		
		/*catch(StringIndexOutOfBoundsException e) {
			System.out.println("Dont do that");
		}
		catch(ArithmeticException e) {
			System.out.println("Dont do that dont divide by zero");
		}
		finally{
			System.out.println("this will print anyways");
			
			
		}*/
	}

}
