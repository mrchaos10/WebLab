import java.rmi.*;
import java.rmi.server.*;
public class FactorialRemote extends UnicastRemoteObject implements Factorial
{
FactorialRemote()throws RemoteException
{
super();
}
public int fact(int x)
{
	System.out.println("Factorial of"+x+"is :");
	for(int i=x-1;i>=1;i--)
	{
		x*=i;
	}
return x;
}
}