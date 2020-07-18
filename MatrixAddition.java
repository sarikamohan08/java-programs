import java.util.Scanner;

class MatrixAddition {
	static int row;
	static int column;
	static int matrix1[][];
	static int matrix2[][];
	static int sum[][];
	public static void create() {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter no.of rows and columns:");
		row=scan.nextInt();
		column=scan.nextInt();
		matrix1=new int[row][column];
		matrix2=new int[row][column];
		sum=new int[row][column];
		System.out.println("enter the data for 1st matrix:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				matrix1[i][j]=scan.nextInt();
			}
		}
		System.out.println("enter the data for 2nd matrix:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				matrix2[i][j]=scan.nextInt();
			}
		}
	}
	public static void display() {
		System.out.println("the 1st matrix is:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.println("\t"+matrix1[i][j]);
			}
			System.out.println();
		}
		System.out.println("the 2nd  matrix is:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.println("\t"+matrix2[i][j]);
			}
			System.out.println();
		}
	}
	public static void add() {
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				sum[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		System.out.println("the sum matrix is:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.println("\t"+sum[i][j]);
			}
			System.out.println();
		}
	}
}
