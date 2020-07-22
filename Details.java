import java.util.Scanner;

public class Details {
	static String[]name=new String[3];
	static int[]year=new int[3];
	static String[]address=new String[3];
	
	public static void createName(int i) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("enter name:");
		name[i]=scan.nextLine();
		
	}
	public static void createAddress(int i) {
		Scanner scan1= new Scanner(System.in);
		
		System.out.println("enter address:");
		address[i]=scan1.nextLine();
		
	}
	public static void createYear(int i) {
		Scanner scan2= new Scanner(System.in);
		System.out.println("enter year:");
		year[i]=scan2.nextInt();
	}
	public static void display(int i) {
		System.out.println("enter name:"+name[i]);
		System.out.println("enter year:"+year[i]);
		System.out.println("enter addres:"+address[i]);
		}
}


