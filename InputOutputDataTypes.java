import java.util.Scanner;

public class InputOutputDataTypes {

	public static void main(String[] args) {
		//string 
		//String a=new String();
		//array
		//char arr[]=new char[10];
		//int
		//int arr[]=new int[10];
		System.out.println("enter name:");
		String name=new String();
		Scanner scan=new Scanner(System.in);
		name=scan.nextLine();
		System.out.println("enter age:");
		String age=new String();
		Scanner scan1=new Scanner(System.in);
		age=scan1.nextLine();
		System.out.println("entered name:"+name);
		System.out.println(name+" age is"+age);
	}

}
