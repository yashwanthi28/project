package project59;
import java.util.Scanner;
public class add1 {
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int num=sc.nextInt();
	        int count=0;
	        int m=1;
	        while((num&m)!=0){
	            m=m<<1;
	            count++;
	        }
	        for(int i=0;i<=count;i++){
	            int val=(int)(Math.pow(2,i));
	            num= num^val;
	        }
	        System.out.println(num);
	    }
	}
