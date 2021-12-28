package project34;
import java.util.Scanner;
public class asciivalue {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any character:");
			
			char ch=sc.nextLine().charAt(0);
			System.out.println("Enter the distance:");
			int d=sc.nextInt();
			char res=(char)(ch+d);
			System.out.println(res);
			
			

		}


}
