import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LoginServlet extends HttpServlet{
protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServletException
{
resp.setContentType("text/html");
PrintWriter out=resp.getWriter();
req.getRequestDispatcher("link.html").include(req,resp);
String name=req.getParameter("name");
String password=req.getParameter("password");
if(password.equals("admin123"))
{
out.print("You are successfully logged in");
out.print("<br> Welcome Mr."+name);
HttpSession session=req.getSession();
session.setAttribute("name",name);
}
else
{
out.print("Sorry username or password doesnt exist");
req.getRequestDispatcher("login.html").include(req,resp);
}
out.close();
}
}