import java.io.*;
import java.net.*;
import java.util.Scanner;
public class client
{
public static void main(String[] args)
{
	try
	{
		InetAddress ip=InetAddress.getLocalHost();
        Socket s=new Socket(ip.getHostName(),1000);
		DataOutputStream out =new DataOutputStream(s.getOutputStream());
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the request message");
		String see=sc.next();
		out.writeUTF(see);
		out.flush();
		out.close();
		
		ServerSocket ss=new ServerSocket(1001);
        Socket s1=ss.accept();
        DataInputStream in=new DataInputStream(s1.getInputStream());

        String str=in.readUTF();
        System.out.println("Response from server");
        System.out.println(""+str);

		s.close();
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}
}