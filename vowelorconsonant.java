package project7;
	import java.util.Scanner;

	public class vowelorconsonant {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			char vc = sc.next().charAt(0);
			
			if(vc == 'a' || vc == 'e' || vc == 'i' || vc == 'o' || vc == 'u')
				System.out.println("Vowels");
			else
				System.out.println("Consonants");
			
			System.out.println("Checking for Uppercase character...");
		      
		      System.out.println("Character: "+ vc);
		      if (Character.isUpperCase(vc)) {
		         System.out.println("Character is in Uppercase!");
		      }else {
		         System.out.println("Character is in Lowercase!");
		         
		     sc.close();
		      }
		   }
		}


