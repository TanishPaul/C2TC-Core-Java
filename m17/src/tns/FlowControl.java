package tns;

public class FlowControl {

	public static void main(String[] args) {
	int x=10;
	final int y=30;
	switch(y)
	{
	case 10:
		System.out.println(10);
		break;
		
	case y:
		System.out.println(30);
		break;
	}

	}

}
