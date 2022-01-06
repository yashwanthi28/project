package project62;
public class volumeofsquareandrectangle {
	    public static int volume(int length,int width,int height){
	        int volum=0;
	        volum=length*width*height;
	        System.out.println("volume of rectangle");
	        return volum;
	    }
	    public static int volume(int side){
	        int volum=0;
	        volum=side*side*side;
	        System.out.println("volume of square");
	        return volum;
	    }
	    public static void main(String[] args) {
	        System.out.println(volume(8,1,3));
	        System.out.println(volume(2));
	    }
	}

