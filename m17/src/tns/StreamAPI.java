package tns;
import java.util.ArrayList;
import java.util.List;

public class StreamAPI {

	public static void main(String[] args) {
	
	List<Integer> ol=List.of(13,76,87,85,35,79,0,8,75,41,90);
	System.out.println(ol);
	
	List<Integer> el=new ArrayList<>();
	for (Integer i:ol)
	{
		if(i%2==0)
		{
			el.add(i);
		}
	}
	System.out.println(el);

	}

}
