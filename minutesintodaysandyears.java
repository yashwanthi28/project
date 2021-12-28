package project37;
import java.util.Scanner;
public class minutesintodaysandyears {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter minutes:");
			int min=sc.nextInt();
			int years=min/525600;
			int days=min/1440;
			
			System.out.println(min+" "+"minutes is"+" "+years+"years and"+" "+days+"days");

		}

	}

