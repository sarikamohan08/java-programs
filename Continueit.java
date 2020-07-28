
public class Continueit {

	public static void main(String[] args) {
		for(int i=50;i>=0;i=i-10) {
			if(i==30) {
				continue;
			}
			System.out.println("value of i="+i);
			System.out.println("\n");
		}
	}

}
