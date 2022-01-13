package project84;
public class max_element {
	 public static void main(String args[]){
	   int a[][]={{7,8,10},{19,28,12},{1,5,35}};
	   for(int i=0;i<3;i++){
	    int max=Integer.MIN_VALUE;
	    for(int j=0;j<3;j++){
	       if(a[i][j]>max)
	        max=a[i][j];
	     }
	   System.out.println(max);{}
	   }
	   
	  }
	 }