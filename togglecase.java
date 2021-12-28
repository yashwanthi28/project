package project33;
import java.util.Scanner;
public class togglecase {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any character:");
			char ch=sc.nextLine().charAt(0);
			if(ch>=97&&ch<=127)
			{
				char uc=(char)(ch-'a'+'A');
				System.out.println(uc);
			}
			else if(ch>=65&&ch<=90)
			{
				char lc=(char)(ch-'A'+'a');
				System.out.println(lc);
				
			}
			else
			{
				System.out.println("check the character you entered");
			}

		}

	}


