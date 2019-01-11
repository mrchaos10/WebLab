import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class RegisterForm extends HttpServlet
{
protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
{
String employeeid=request.getParameter("employeeid");
String password=request.getParameter("password");
String name=request.getParameter("name");
String department=request.getParameter("department");

try
{
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@192.168.1.150:1521:SFLDB1","WEBTECH","COMMON");  
  
//step3 create the statement object  
Statement stmt=con.createStatement(); 

stmt.executeUpdate("INSERT INTO EMP VALUES(3,'"+employeeid+"','"+password+"'");
PrintWriter out=response.getWriter();

out.println("<h2>Succesfully Registered your details </h2>");

}
catch(Exception e)
{
e.printStackTrace();
}
}
}