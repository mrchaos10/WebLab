import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ProfileServlet extends HttpServlet{
protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServletException
{
resp.setContentType("text/html");
PrintWriter out=resp.getWriter();
req.getRequestDispatcher("link.html").include(req,resp);
HttpSession session=req.getSession(false);

if(session!=null)
{
	String name=(String) session.getAttribute("name");
	out.print("Hello Mr,"+name+"\n Welcome to Profile");
}
else{
out.print("please login first");
req.getRequestDispatcher("login.html").include(req,resp);
}

out.close();

}
}