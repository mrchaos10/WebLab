package staticstub;
import javax.xml.rpc.*;
public class HelloClient
{
	private String endpointAddress;
	public static void main(String[] args)
	{
		System.out.println("Endpoint Address ="+args[0]);
		try
		{
			Stub stub = createProxy();
			stub.setProxy(javax.xml.rpc.Stub.ENDPOINT_ADDRESS_PROPERTY,args[0]);
			HelloIF hello=(HelloIF) stub;
			System.out.println(hello.sayHello("Hi Mann!"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static Stub createProxy()
	{
		//NOTE MY HELLO SERVICE IMPLEMENTATION JAVA PROGRAM IS IMPLEMENTATION SPECIFIC
		return (Stub) (new MyHelloService.Impl().getHelloIFPort());
	}
	
}