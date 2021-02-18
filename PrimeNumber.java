import java.util.Scanner;

public class PrimeNumber{

    public static void main(String[] args) {
        int i,j;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter your n:");
	int a=scan.nextInt();
       
        for (i = 2; i <= a; i++) {

            boolean isPrime = true;
            for(j=2;j<i;j++){
		if(i%j==0){
			isPrime=false;
			break;
			}
		}
	if(isPrime){
		System.out.println(i);
       	 }
    	
     }
  }
}