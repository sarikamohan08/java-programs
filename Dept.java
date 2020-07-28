import java.util.Scanner;

public class Dept{
		static final int  n = 1;
		public static void main(String[] args)
		{
			//my code here
			Scanner sc = new Scanner(System.in);
			Student[] s = new Student[n];
			System.out.println("Enter the Student Id =");
			s[0].Id = sc.nextInt();
			//System.out.println("Enter the Student Name =");
			//s[0].name = sc.nextLine();
			Scanner sc1 = new Scanner(System.in);
			Student[] h=new Student[n];
			System.out.println("Enter the Student age =");
			s[0].age = sc1.nextInt();
			System.out.println("Entered Input "+s[0].Id);
			System.out.println("Entered Input "+s[0].name);
			System.out.println("Entered Input "+s[0].age);  
		}
	}


