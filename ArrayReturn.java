
public class ArrayReturn {
	public static void printArry(int[]array) {
		for (int i=0;i<array.length;i++) {
			System.out.println(array[i]+"");
		}
	}
	public static int[] reverse(int[]list) {
		int []result = new int[list.length];
		int len=result.length;
		for(int i=0,j=len-1;i<len;i++,j--) {
			result[j]=list[i];
		}
		return result;
	}
	public static void main(String[] args) {
		printArry(reverse(new int[] {1,2,3,4,5,6,7,8}));
	}

}
