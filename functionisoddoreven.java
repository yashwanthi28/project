package project38;
import java.util.Scanner;
public class functionisoddoreven {
	    public static String odd_even(int n){
	        String a;
	        if(n%2==0){
	            a="number is even";
	        }
	        else{
	            a="number is odd";
	        }
	        return a;
	    }
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int ch;
	        do{
	            int n= sc.nextInt();

	            System.out.println(odd_even(n));
	            System.out.println("if you want to continue press 1");
	            ch=sc.nextInt();
	        }while (ch==1);
	    }
	}


