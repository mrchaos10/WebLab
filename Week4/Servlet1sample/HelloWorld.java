import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Scanner;
//@WebServlet(value= "/HelloWorld" ) 
public class HelloWorld extends HttpServlet
{
//private static final long serialVersionUID=1L;
private String message;
public void init() throws ServletException
{
message="Greetings from Me!The Tomcat";
}
public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();
//Scanner sc=new Scanner(System.in);
//message=sc.next();
out.println("<h1>"+message+"</h1>");
java.util.Date date=new java.util.Date();
out.println("<h4>"+"Today's Date is:"+"</h4>");
out.println("<p>"+date.toString()+"</p>");
out.close();
}
}