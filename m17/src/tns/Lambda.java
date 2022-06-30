package tns;
interface Anonymous
{
	void show();
}
public class Lambda {

	public static void main(String[] args) {
	Anonymous l=()->
	{
		System.out.println("Lambda Print..!!");
	};
	l.show();

	}

}
