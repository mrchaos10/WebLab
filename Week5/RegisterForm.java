import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class RegisterForm extends HttpServlet
{
protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
{
try
{
String employeeid=request.getParameter("employeeid");
String password=request.getParameter("password");
String name=request.getParameter("name");
String department=request.getParameter("department");
Class.forName("com.mysql.jdbc.Driver");
String DB_URL="jdbc:mysql://localhost/employee";
String DB_USER="root";
String DB_Pass="lAvv6rLBFHUhOtlh";
Connection conn=DriverManager.getConnection(DB_URL,DB_USER,DB_Pass);
Statement stmt=conn.createStatement();
stmt.executeUpdate("INSERT INTO EMPLOYEEDETAILS VALUES('"+employeeid+"','"+password+"','"+name+"','"+department+"')");
PrintWriter out=response.getWriter();
out.println("<h2>Succesfully Registered your details </h2>");
conn.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}