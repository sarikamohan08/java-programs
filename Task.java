import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Input the number of minutes: ");
        double min = input.nextDouble();
        Conversion c=new Conversion();
        c.convo(min);
      
        
	}

}