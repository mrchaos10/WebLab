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
Adder Stub=(Adder) Naming.lookup("rmi://localhost:8089/varadharajan");
System.out.println("Calling the remote Interface");
System.out.println("Enter the two numbers to be added");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println(a+"+"+b+"="+Stub.add(a,b));
}
catch(Exception e)
{
e.printStackTrace();
}
}
}