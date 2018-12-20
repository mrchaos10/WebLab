import java.rmi.*;  
public class Server{  
public static void main(String args[])throws Exception{  
Remote r=new BankImpl();  
Naming.rebind("rmi://localhost:6666/javatpoint",r);  
}}  