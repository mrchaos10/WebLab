package staticsub;
import javax.rmi.*;
public interface HelloIF extends Remote
{
	public String SayHello(String s) throws remoteException;
}

