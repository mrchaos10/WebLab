import java.io.*;
import java.net.*;
import java.util.Scanner;
public class server
{
public static void main(String[] args)
{
try{
	Scanner sc=new Scanner(System.in);
ServerSocket ss=new ServerSocket(1000);
Socket s=ss.accept();
DataInputStream in=new DataInputStream(s.getInputStream());

String str=in.readUTF();
System.out.println("Request from Client");
System.out.println(""+str);
//Scanner sc=new Sc Scanner(System.in);
//System.out.println("Enter the request message");
//String str=sc.next();
        Socket s1=new Socket("localhost",1001);
		DataOutputStream out =new DataOutputStream(s1.getOutputStream());
		System.out.println("Enter the Response Message");
		String se=sc.next();
		out.writeUTF(se);
		out.flush();
		out.close();
		


ss.close();
}

catch(Exception e)
{
e.printStackTrace();
}
}
}