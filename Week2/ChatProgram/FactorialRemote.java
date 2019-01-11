import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
import java.util.Scanner;
public class FactorialRemote extends UnicastRemoteObject implements Factorial
{
FactorialRemote()throws RemoteException
{
super();
}
public String printer(String x)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Message From Client :"+x);
	System.out.println("Enter the Message to be sent to Client");
	String y=sc.next();
	return y;
}
}