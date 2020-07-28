import java.util.Scanner;

public class Switchc {

	public static void main(String[] args) {
		//char grade;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter grade:");
		char grade=scan.next().charAt(0);
		switch(grade){
			case 'a':
				System.out.println("a grade");
				break;
			case 'b':
				System.out.println("b grade");
				break;
			default:
				System.out.println("invalid grade");
				break;
		}

	}

}
