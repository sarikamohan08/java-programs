
public class ConstructorDemo {
	int x;
	ConstructorDemo(int i){
	x=i;
	}

	public static void main(String[] args) {
		ConstructorDemo t1=new ConstructorDemo(10);
		ConstructorDemo t2=new ConstructorDemo(20);
		System.out.println(t1.x+" "+t2.x);
	}

}
