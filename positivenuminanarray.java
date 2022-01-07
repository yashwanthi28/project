package project67;
import java.util.Scanner;
public class positivenuminanarray {
	    public static void positive(int arr[]){

	        for(int i=0;i<arr.length;i++){
	            if(arr[i]>=0){
	                System.out.print(arr[i]+" ");;
	            }
	            else{
	                continue;
	            }
	        }
	    }
	    public static void main(String[] args) {
	        int mark[]=new int[10];
	        Scanner sc = new Scanner(System.in);
	        for(int i=0;i<10;i++){
	            mark[i]= sc.nextInt();
	        }
	        positive(mark);

	    }
	}

