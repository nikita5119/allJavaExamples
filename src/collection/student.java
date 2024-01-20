package collection;

public class student implements Comparable<student> {
	String name;
	int grade;
	public student(String n, int g) {
		name=n;
		grade=g;
	}
	
	//categorization
	public int hashCode(){ // hasCode and equals are the children of object program jun lekhi raknu parchaina  all program ma autommatic nai huncha thats why there is a greeen arrow
		return grade;
		
	}
	
	
	@Override
	public String toString() {
		return "[grade=" + grade + ", name=" + name + "]";
	}
	//duplicate check
	public boolean equals(Object anotherObject) {
		student anotherStuObject = (student)anotherObject;
		if(this.grade == anotherStuObject.grade && this.name.equals(anotherStuObject.name)) {
			return true;
		}
		else {
			return false;
		}
	}


	@Override
	public int compareTo(student anotherObject) {
		// TODO Auto-generated method stub
		
		return this.name.compareTo(anotherObject.name);
	}
	
	
}
