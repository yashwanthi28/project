package project112;

public class allpairofelements {
	    static void allpairofelements(int inputArray[], int inputNumber)
	    {
	        System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
	 
	        for (int i = 0; i < inputArray.length; i++)
	        {
	            for (int j = i+1; j < inputArray.length; j++)
	            {
	                if(inputArray[i]+inputArray[j] == inputNumber)
	                {
	                    System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber);
	                }
	            }
	        }
	    }
	 
	    public static void main(String[] args)
	    {
	    	allpairofelements(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
	 
	    	allpairofelements(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);
	 
	    	allpairofelements(new int[] {12, 13, 40, 15, 8, 10, -15}, 25);
	 
	    	allpairofelements(new int[] {12, 23, 125, 41, -75, 38, 27, 11}, 50);
	    }
	}

