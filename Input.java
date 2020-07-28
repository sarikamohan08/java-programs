import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter value");
		int user_input=scan.nextInt();
		System.out.println("value is"); 
		System.out.print(user_input);
		
		//Scanner scan1=new Scanner(System.in);
		System.out.println("enter value");
		double user_input1=scan.nextDouble();
		System.out.println("value is"); 
		System.out.print(user_input1);
		
		Scanner scan2=new Scanner(System.in);
		System.out.println("enter string");
		String user_input2=scan2.nextLine();
		System.out.println("string is"); 
		System.out.print(user_input2);
		
	}

}
