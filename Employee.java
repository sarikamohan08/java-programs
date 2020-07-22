
public class Employee {

	public static void main(String[] args) {
		Details obj=new Details();
		
		for(int i=0;i<3;i++) {
		obj.createName(i);
		obj.createAddress(i);
		obj.createYear(i);
		obj.display(i);
	}
		
}
}
