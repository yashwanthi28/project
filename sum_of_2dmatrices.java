package project85;
import java.util.Scanner;
public class sum_of_2dmatrices {
		public static void main(String[] args) {
			int a[][]=new int[3][3];
			int b[][]=new int[3][3];
			int c[][]=new int[3][3];
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter array elements in first matrix");
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter array elements in second matrix");
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					b[i][j]=sc.nextInt();
			
				}
				System.out.print("\n");
			}
			System.out.println("sum of two matrix");
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					c[i][j]=a[i][j]+b[i][j];
					System.out.print(c[i][j]+" ");
				}
				System.out.print("\n");
			}


		}
}


