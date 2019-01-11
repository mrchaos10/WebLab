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
System.out.println("Enter the number to be taken factorial");
int a=sc.nextInt();
System.out.println(Stub.fact(a));
}
catch(Exception e)
{
e.printStackTrace();
}
}
}