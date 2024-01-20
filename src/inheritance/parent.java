package inheritance;

public class parent extends grandParent {
	 int a = 10;
	 public void method1() {
		 
		 System.out.println("This is parent method");
		 System.out.println(this.a);
		 System.out.println(super.a);
	 }

}
