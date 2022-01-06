package project60;
import java.util.Scanner;
public class helloandname {
	    public static void nam(String name){
	        System.out.println("Hello  " +name);
	    }
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        String name= sc.nextLine();
	        nam(name);
	    }
	}

