
public class VariablesDemo {
	int b=10 ;//instance variable
	//instance variable is used by variables  to store their states 
	static int c =8;
	public static void main(String[] args) {
		int a=5;//local variable
		//obj is instance of class
		VariablesDemo obj=new VariablesDemo();
		System.out.println("local variable:"+a);
		System.out.println("instance variable:"+obj.b);
		System.out.println("static variable:"+obj.c);
	}

}
