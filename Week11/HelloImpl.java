package staticsub;
import javax.rmi.*;
public class HelloImpl implements HelloIF
{
	public String message="Hello";
	public String sayHello(String s)
	{
		return s+message;
	}
}

