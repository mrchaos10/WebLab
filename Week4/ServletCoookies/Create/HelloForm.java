import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HelloForm extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
{
Cookie firstName=new Cookie("first_name",request.getParameter("first_name"));
Cookie lastName=new Cookie("last_name",request.getParameter("last_name"));

firstName.setMaxAge(60*24*24);
lastName.setMaxAge(60*24*24);

response.addCookie(firstName);
response.addCookie(lastName);

response.setContentType("text/html");
PrintWriter out=response.getWriter();
String title="Form Cookies";
String doctype="<!DOCTYPE html>";
out.println(doctype+
            "<html> \n"+
			"<head> \n"+
			"<title>"+ title+"</title> \n"+
			"<link rel=\"stylesheet\" type=\"text/css\" href=\"helloform.css\">"+
			"</head>\n"+
			"<body bgcolor= \"#f0f0f0\"> \n"+
			"<div class=\"profile\">"+
			"<h1 align =\"center\">"+title+"</h1>\n"+
			"<ul align=\"center\"> \n"+
			"<li align = \"center\"> <b> First Name:</b> \n"+
	        request.getParameter("first_name")+"</li> \n"+		
			"<li align = \"center\"> <b> Last Name:</b> \n"+
	        request.getParameter("last_name")+" </li> \n"+
            "<li align = \"center\"> <b> Roll Number:</b> \n"+
	        request.getParameter("roll_number")+" </li> \n"+
			"<li align = \"center\"> <b> Department:</b> \n"+
	        request.getParameter("department")+" </li> \n"+
			"<li align = \"center\"> <b> Branch:</b> \n"+
	        request.getParameter("branch")+" </li> \n"+			
			"<li align = \"center\"> <b> Year:</b> \n"+
	        request.getParameter("year")+" </li> \n"+			
			"<li align = \"center\"> <b> Semester:</b> \n"+
	        request.getParameter("semester")+" </li> \n"+			
			"</ul> \n"+
			"<h1 align=\"center\"> Table </h1> \n"+
            "<table border=\"4\"> \n"+
            "<th> FirstName </th>"+
            "<th> Last Name </th>"+
            "<th> Roll Number </th>"+
            "<th> Department </th>"+ 			
			"<th> Year </th>"+
			"<th> Branch </th>"+
			"<th> Semester </th>"+
			"<tr>"+
			"<td>"+request.getParameter("first_name")+"</td> \n"+
			"<td>"+request.getParameter("last_name")+"</td> \n"+
			"<td>"+request.getParameter("roll_number")+"</td> \n"+
			"<td>"+request.getParameter("department")+"</td> \n"+
			"<td>"+request.getParameter("year")+"</td> \n"+
			"<td>"+request.getParameter("branch")+"</td> \n"+
			"<td>"+request.getParameter("semester")+"</td> \n"+
			"</tr>\n"+
			"</table>"+
			"</div> \n"+
			"</body> \n"+
			"</html>"
			);
		}
	}