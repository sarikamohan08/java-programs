
public class ArrayArgument {
	public static void printArray(int[] Arry) {
		for(int i=0;i<Arry.length;i++) {
			System.out.println(Arry[i]);
		}
	}
	public static void main(String[] args) {
		printArray(new int[] {1,2,3,4,5,6});
	}

}
