package project110;
import java.util.Arrays;
public class elementinrotatedandsortedarray {
	    public static void main(String[] args) {
	        int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
	        int n = arr.length;
	        int key = 3;
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]==key){
	                System.out.println(arr[i]+" at the position "+i);
	            }
	        }
	    }
	}

