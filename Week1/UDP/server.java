import java.net.*;
import java.util.Scanner;
public class server
{
public static void main(String[] args) throws Exception
{
	
DatagramSocket ds=new DatagramSocket(6000);
byte[] buf=new byte[1024];
DatagramPacket dp=new DatagramPacket(buf,1024);
ds.receive(dp);
String str=new String(dp.getData(),0,dp.getLength());
System.out.println(str);

Scanner sc=new Scanner(System.in);
System.out.println("Enter the response message");
String s=sc.next();
InetAddress ip=InetAddress.getByName("127.0.0.1");
DatagramPacket dp1=new DatagramPacket(s.getBytes(),s.length(),ip,7000);

ds.send(dp1);

ds.close();
}
}