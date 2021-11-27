package project3;
import java.util.Scanner;
public class countofdigits { 
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("enter any number");
	    int num= sc.nextInt();
		while(num!=0) {
				num = num/10;
				count++;
				
			}
			System.out.print("no.of digits" +count);
	}
}	

