package project11;
import java.util.Scanner;
public class diamond {
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int n= sc.nextInt();
	        for(int i=0;i<n;i++){
	            for(int j=1;j<n-i;j++){
	                System.out.print(" ");
	            }
	            for(int a=0;a<=i;a++){
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }
	}


