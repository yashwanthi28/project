package project91;
import java.util.*;
public class sizenmatrix {
		public static void sizenmatrix(int n,int[][]a) {
			 n=a.length;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		for(int i=0;i<n;i++) {
			int li=0,ri=n-1;
			while(li<ri) {
				int temp=a[i][li];
				a[i][li]=a[i][ri];
				a[i][ri]=temp;
				li++;
				ri--;
			}
		}
		for(int i=0;i<n;i++) {	
			for(int j=0;j<n;j++) {
		System.out.print(a[i][j]+" ");	
			}
			System.out.println();
		}
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of the matrix");
		int n=sc.nextInt();
		int[][]a=new int[n][n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		sizenmatrix( n,a);
		}
	}

