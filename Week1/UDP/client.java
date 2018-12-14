import java.net.*;
import java.util.Scanner;
public class client
{
public static void main(String[] args) throws Exception
{
DatagramSocket ds=new DatagramSocket();
//String s="I am in";
Scanner sc=new Scanner(System.in);
System.out.println("Enter the request message");
String s=sc.next();
InetAddress ip=InetAddress.getByName("127.0.0.1");
DatagramPacket dp=new DatagramPacket(s.getBytes(),s.length(),ip,6000);
ds.send(dp);

DatagramSocket ds1=new DatagramSocket(7000);
byte[] buf=new byte[1024];
DatagramPacket dp1=new DatagramPacket(buf,1024);
ds1.receive(dp1);
String str=new String(dp1.getData(),0,dp1.getLength());
System.out.println(str);
ds.close();
	
}
}