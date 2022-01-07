package project71;
import java.util.*;
public class lastindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a element that u want search in the array");
        int key=sc.nextInt();
        int index=0;
        int flag=0;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                index=i;
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("element not found");
        }
        else{
            System.out.println("last index of your element is "+index);
        }
        
    }
}

