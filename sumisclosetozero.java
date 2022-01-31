package project105;
public class sumisclosetozero {
	    public static void main(String[] args) {
	        int arr[] = {2, 8, -4, 20, -28, 19};
	        int min=Integer.MAX_VALUE;
	        int posi=-1;
	        int posj=-1;
	        for(int i=0;i< arr.length;i++){
	            for(int j=i+1;j< arr.length;j++){
	                int sum=Math.abs(arr[i]+arr[j]);
	                if(sum<min){
	                    min=sum;
	                    posi=i;
	                    posj=j;
	                }
	            }
	        }
	        System.out.println(min);
	        System.out.println(arr[posi]+" both these are pair "+arr[posj]);
	    }
	}