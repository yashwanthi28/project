package project12;
import java.util.Scanner;
public class sumofseries {
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int n= sc.nextInt();
	        float sum=0f;
	        for(float i=1;i<=n;i++){
	            sum+=1/i;
	        }
	        System.out.println(sum);
	    }
}
