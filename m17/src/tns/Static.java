package tns;

public class Static {
	String name;
	int roll;
	static String college="St. John College of Engineering and management";
	
	void display()
	{
		System.out.println(roll+" "+name+" "+college);
	}
	
	public Static(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	public static void main(String[] args) {
	Static s1=new Static("Tanish",5);
	Static s2=new Static("Tanu",8);
	s1.display();
	s2.display();
	}

	}


