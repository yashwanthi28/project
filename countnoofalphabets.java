package project74;
public class countnoofalphabets {
	  public static void main(String[] args) {
	    String str1="english is the easy lang" ;
	    int count=0;
	    for (int i=0;i<str1.length();i++)
	    {
	       if(Character.isLetter(str1.charAt(i)))
	count++;
	    }
	System.out.println("the number of alphabets in the given string is:"+count);
	  }
	}

