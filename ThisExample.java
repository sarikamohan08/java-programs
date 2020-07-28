
public class ThisExample { 
	int num=10;
	ThisExample(){
	System.out.println("eg!");
}
	ThisExample(int num){
		this();
		this.num=num;
	}
	public void greet() {
		System.out.println("hii");
	}
	public void print() {
		int num=20;
		System.out.println("local="+num);
		System.out.println("instance="+this.num);
		this.greet();
	}
	public static void main(String[] args) {
		ThisExample obj1=new ThisExample();
		obj1.print();
		ThisExample obj2=new ThisExample(40);
		obj2.print();
	}

}
