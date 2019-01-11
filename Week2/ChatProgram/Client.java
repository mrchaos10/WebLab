import java.rmi.*;
import java.io.*;
import java.util.Scanner;
public class Client
{
public static void main(String[] args)
{
try
{
Scanner sc=new Scanner(System.in);
Factorial Stub=(Factorial) Naming.lookup("rmi://localhost:8089/varadharajan");
System.out.println("Calling the remote Interface");
System.out.println("Enter the String to be Manipulated");
System.out.println("Chat Program On");
String m=null;
while(m.notEquals("bye"))
{
String a=sc.next();
m=Stub.printer(a);
System.out.println("Server Replied :"+m);
}
}
catch(Exception e)
{
e.printStackTrace();
}
}
}