
public class Prob1 {

	public static void main(String[] args) {
		int a []= {1,2,3,4};
		int d[]=a;
		int sum=0;
		for(int j=0;j<3;++j)
		{
			sum+=(a[j]*d[j+1])+(a[j+1]*d[j]);
		}
		System.out.println(sum);
	}

}
//output: 40