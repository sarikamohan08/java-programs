package package2;
import package1.Car;
public class Hundai extends Car{

	public static void main(String[] args) {
		Hundai h1=new Hundai();
		System.out.println("this is extended class");
		h1.display();
		System.out.println("color:"+h1.color);
	}

}
