package project96;

public class person {
	    // fields
	    private String name;
	    private String email;
	    private String phoneNumber;

	    // constructor
	    public person(String theName)
	    {
	        this.name = theName;
	    }
	    public person(String thename,String email){
	        this.name=thename;
	        this.email=email;
	    }
	    public person(String thename,String email,String ph_no){
	        this.name=thename;
	        this.email=email;
	        this.phoneNumber=ph_no;
	    }

	    // methods - getters
	    public String getName() { return this.name;}
	    public String getEmail() { return this.email;}
	    public String getPhoneNumber() { return this.phoneNumber;}

	    // methods - setters
	    public void setName(String theName) { this.name = theName;}
	    public void setEmail(String theEmail) {this.email = theEmail;}
	    public void setPhoneNumber(String thePhoneNumber) { this.phoneNumber = thePhoneNumber;}
	    public String toString()
	    {
	        return this.name + " " + this.email + " " + this.phoneNumber;
	    }

	    // main method for testing
	    public static void main(String[] args)
	    {
	        person p1 = new person("Sana");
	        System.out.println(p1);
	        person p2 = new person("Jean");
	        p2.setEmail("jean@gmail.com");
	        p2.setPhoneNumber("404 899-9955");
	        System.out.println(p2);
	        person p3=new person("rama","rama123gmail.com","432678");
	        System.out.println(p3);
	        person p4=new person("sita","sita456@gmail.com");
	        p4.setPhoneNumber("54382578");
	        System.out.println(p4.getEmail());
	        System.out.println(p4);
	    }
	}

