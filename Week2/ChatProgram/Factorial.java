import java.rmi.*;
import java.io.*;
public interface Factorial extends Remote
{
public String printer(String x)throws RemoteException;
}