 class Person{
	String name="sarika";
	public void display() {
		System.out.println("this is super cls");
	}
}
public class Employee extends Person{
	String name="mohan";
	
	public void display() {
	System.out.println("super cls name="+super.name);
	System.out.println("sub cls name="+name);
	}
	public void finalDisplay() {
		super.display();
	}
	public static void main(String[] args) {
			Employee e=new Employee();
			e.display();
			e.finalDisplay();
	}
}

