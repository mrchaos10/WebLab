import java.rmi.*;
import java.rmi.registry.*;
public class Server
{
public static void main(String[] args)
{
try
{
Adder Skeleton=new AdderRemote();
Naming.rebind("rmi://localhost:8089/varadharajan",Skeleton);
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
