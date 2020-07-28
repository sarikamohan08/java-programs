
public class Instancevar {
		int c;
		public void addition() {
			int a=10;
			int b=20;
			c=a+b;
			System.out.println("sum="+c);
		}
		public void sub() {
			int x=30;
			int y=20;
			c=x-y;
			System.out.println("sub="+c);
		}
		public static void main(String[] args) {
			Instancevar ins1=new Instancevar();
			ins1.addition();
			ins1.sub();
	}

}
