package project72;
import java.util.*;
public class differenceintwoarrays {
	    public static void main(String[] args) {
	        // TODO code application logic here
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the length of arrays ");
	        int n = sc.nextInt();
	        int[] arr1=new int[n];
	        System.out.println("Enter the elements of first array");
	        for(int i=0;i<n;i++){
	            arr1[i]=sc.nextInt();
	        }
	        
	        int[] arr2=new int[n];
	        System.out.println("Enter the elements of second array");
	        for(int i=0;i<n;i++){
	            arr2[i]=sc.nextInt();
	        }
	        
	        int[] res = new int[n];
	        
	        for(int i=0;i<n;i++){
	            res[i]=arr1[i]-arr2[i];
	        }
	        System.out.println("resultant array is ");
	        for(int i=0;i<n;i++){
	            System.out.print(res[i]+" ");
	        }
	        
	    }
	    
	}

