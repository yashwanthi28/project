package project104;

public class lengthofstring {
	    public static int LengthOfString(String str)
	    {
	        int length=0;
	        char[] strCharArray=str.toCharArray();
	        for(char c:strCharArray)
	        {
	            length++;
	        }
	        return length;
	    }
	    public static void main(String[] args) {
	        String s="hiesguh";
	        System.out.println(LengthOfString(s));
	    }
	}

