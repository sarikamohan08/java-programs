class Outer_Demo{
	private class InnerDemo{
		
		public void print1() {
			System.out.println("this is inner class");
		}
	}
public void display_inner() {
		InnerDemo inClass=new InnerDemo();
		inClass.print1();
	}
}
public class Innerclasses {
	public static void main(String[] args) {
	Outer_Demo outClass=new Outer_Demo();
	outClass.display_inner();

	}

}
