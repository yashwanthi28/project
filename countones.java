package project108;
import java.util.Scanner;
public class countones {
	    public static void main(String[] args) {
	 
	        Scanner scn = new Scanner(System.in);
	        int[] arr = new int[scn.nextInt()];
	 
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = scn.nextInt();
	        }
	 
	        System.out.println(solve(arr));
	 
	    }
	 
	    public static int solve(int[] arr) {
	        int currPointer = 0;
	 
	        while (currPointer < arr.length) {
	            if (arr[currPointer] == 1) {
	                break;
	            }
	            currPointer++;
	        }
	 
	        return (arr.length - currPointer);
	 
	    }
	}
	 



