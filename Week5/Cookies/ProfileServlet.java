import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ProfileServlet extends HttpServlet{
protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServletException
{
resp.setContentType("text/html");
PrintWriter out=resp.getWriter();
req.getRequestDispatcher("link.html").include(req,resp);
Cookie ck[]=req.getCookies();
if(ck!=null)
{
String name=ck[0].getValue();
if(!name.equals("")||name!=null)
{
out.print("<b> Welcome to profile </b>");
out.print("<b> Welcome,"+name);
}
else
{
out.print("Please Login First");
req.getRequestDispatcher("login.html").include(req,resp);
}
}
out.close();

}
}