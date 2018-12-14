import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Basic
{
public static void main(String[] args)
{
	try
	{
Scanner sc=new Scanner(System.in);
System.out.println("Enter an ip or a website name to get InetAddress DETAILS");
String host=sc.next();
InetAddress ip=InetAddress.getByName(host);
System.out.println("IP Address"+ip.getHostAddress());
System.out.println("Request Name"+ip.getHostName());
//Local Host
InetAddress ip1=InetAddress.getLocalHost();
System.out.println("LocalHost IP Address"+ip1.getHostAddress());
System.out.println("LocalHost Name"+ip1.getHostName());
	}
	catch(UnknownHostException e)
	{
		e.printStackTrace();
	}
}
}