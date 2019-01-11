import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LogoutServlet extends HttpServlet{
protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServletException
{
resp.setContentType("text/html");
PrintWriter out=resp.getWriter();
req.getRequestDispatcher("link.html").include(req,resp);
HttpSession session=req.getSession();
session.invalidate();
out.print("You are successfully Logged out!");
out.close();
}
}