class Cal{
	int c;
	public  void add(int a,int b) {
		c=a+b;
		System.out.println("sum="+c);
	}
	public void sub(int a,int b) {
		c=a-b;
		System.out.println("diff="+c);
	}
}
public class Calculation extends Cal{
	public void mul(int a,int b) {
		c=a*b;
		System.out.println("mul="+c);
	}
	public static void main(String[] args) {
	Calculation demo=new Calculation();
	int a=20,b=30;
	demo.add(a,b);
	demo.sub(a,b);
	demo.mul(a,b);
	}
}
