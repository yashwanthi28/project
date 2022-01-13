package project87;
import java.util.Scanner;
public class oddandeven_in_matrix {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter rows");
			int row=sc.nextInt();
			System.out.println("Enter columns:");
			int column=sc.nextInt();
			int [][]arr=new int[row][column];
			System.out.println("Enter elements in array:");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					arr[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			int even=0;
			int odd=0;
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					if(arr[i][j]%2==0)
						even++;
					else
						odd++;
				}
			}
			System.out.println("Even numbers in the matrix are "+even);
			System.out.println("Odd numbers in the matrix are "+odd);
		}

	}
