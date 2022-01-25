package project95;

public class coin {
	   // constant to represent heads
	    private static int HEADS = 1;
	    // current value of the coin
	    private int value = 0;
	    // method to randomly set the value of the coin to heads or tails
	    public void flip()
	    {
	        if (Math.random() < 0.5)
	        {
	            value = 0;
	        }
	        else
	        {
	            value = 1;
	        }
	    }

	    // return true if the value is heads or false otherwise
	    public boolean isHeads()
	    {
	        return value == HEADS;
	    }
	    public boolean istails(){
	        return value!=HEADS;
	    }

	    // convert the value to a string
	    public String toString()
	    {
	        if (value == HEADS) return "Heads";
	        else return "Tails";
	    }
	    public static void main(String[] args) {
	        coin myCoin = new coin();
	        for (int i = 0; i < 10; i++) {
	            myCoin.flip();
	            System.out.print(myCoin+"   ");
	            System.out.println(myCoin.isHeads()+"   ");
	        }
	    }
	}

