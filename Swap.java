
public class Swap {

	public static void swapFunction(int n1,int n2) {
		int n3=n1;
		n1=n2;
		n2=n3;
		System.out.println("before swapping n1=" +n1+",n2="+n2);
	}
	
	public static void main(String[] args) {
		int a=30;
		int b=20;
		System.out.println("before swapping a="+a+", b ="+b);
		swapFunction(a,b);
	}
	
}
 