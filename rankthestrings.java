package project102;
public class rankthestrings {
	public static void main(String[] args) {
	        String arr[]={"sda","itku","ya","jretf"};
	        int max=0;
	        int pos=-1;
	        for(int i=0;i< arr.length;i++){
	            String s=arr[i];
	            int len=s.length();
	            if(max<len){
	                max=len;
	                pos=i;
	            }
	        }
	        System.out.println(arr[pos]);
	    }
	}

