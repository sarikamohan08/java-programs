import java.util.Scanner;


public class OddEvenTryCatch
{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your number:");
		
		try{
			int a=scan.nextInt();
			if(a%2==0){
			System.out.println(a+" "+"is even");
			}
			else{
			System.out.println(a+" "+"is odd");
			}
		    }
		catch(Exception e){
		System.out.println(e.getMessage()+"is not a numeric value");
		}
         }
}
