package project107;

public class localminima {
    public int localminima(int [] arr, int start, int end){
        int mid = start + (end-start)/2;
        int size = arr.length;
        if((mid==0 || arr[mid-1]>arr[mid]) &&
                (mid==size-1 || arr[mid+1]>arr[mid]))
            return arr[mid];
        else if(mid>0 && arr[mid]>arr[mid-1]){
            return localminima(arr, start, mid);
        }
        else { 
            return localminima(arr, mid+1, end);
        }
    }
 
    public static void main(String[] args) {
        localminima l = new localminima();
        int [] arr = {10, 5, 3, 6, 13, 16, 7};
        System.out.println("Local Minima is: " + l.localminima(arr,0,arr.length));
    }
}
 
