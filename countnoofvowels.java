package project75;
import java.util.Scanner;
public class countnoofvowels {
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter String");
			String s = sc.nextLine();
			char[] c = s.toCharArray();
			int vowel=0;
			
			for (int i = 0; i < s.length(); i++) { 
	                    if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='o') 
	                       vowel++; 
			}
	  
		System.out.println("Vowels: " + vowel);

}
		
}
