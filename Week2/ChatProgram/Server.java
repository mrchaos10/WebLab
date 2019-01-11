import java.rmi.*;
import java.rmi.registry.*;
public class Server
{
public static void main(String[] args)
{
try
{
Factorial Skeleton=new FactorialRemote();
Naming.rebind("rmi://localhost:8089/varadharajan",Skeleton);
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
