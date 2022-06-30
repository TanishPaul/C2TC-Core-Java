import org.junit.jupiter.api.*;
public class Demo {
	@RepeatedTest (21)
	void sum()
	{
		int a=23;
		int b=85;
		System.out.println(a+b);
	}
}