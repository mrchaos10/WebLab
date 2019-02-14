import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class SessionSample extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
{
HttpSession session=req.getSession(true);
Date ctime=new Date(session.getCreationTime());
Date laTime=new Date(session.getLastAccessedTime());
String title="WELCOME TO MY WEBSITE";
Integer visitCount=new Integer(0);
String visitCountKey=new String("visitCount");
String userIDkey=new String("userID");
String userID=new String("ABCD");
if(session.isNew())
{
	title="Welcoming you to this website for the first time.";
	session.setAttribute(userIDkey,userID);
}
else
{
	visitCount=(Integer)session.getAttribute(visitCountKey);
	visitCount+=1;
	userID=(String)session.getAttribute(userIDkey);
}
session.setAttribute(visitCountKey,visitCount);
res.setContentType("text/html");
PrintWriter out=res.getWriter();
Integer maxInact=new Integer(0);
maxInact=session.getMaxInactiveInterval();
//digit separation logic
Integer vis=new Integer(0);
vis=visitCount;
Integer count=new Integer(1);
Integer digit[]=new Integer [100];
Integer temp=new Integer(0);
while(vis!=0)
{
	temp=vis%10;
	digit[count]=temp;
	count++;
	vis/=10;
}
for(int i=1;i<5;i++)
{
	if(digit[i]==null)
	{
		digit[i]=0;
	}
}
String doctype="<!doctype html>";
out.println("<html>\n"+
            "<head><title>SessionExample</title></head>\n"+
            "<body bgcolor=\"blue\">\n"+
			"<h1 bgcolor=\"blue\"align=\"center\">"+title+"</h1>\n"+
			"<h2 color=\"red\" align=\"center\">"+"Session info"+"</h2>\n"+
			"<table bgcolor=\"#f39091\" border=\"1\" align=\"center\"> \n"+
			"<tr bgcolor=\"#949494\">\n"+
			"<th> Session Information </th> <th> Value	</th> \n"+
            "</tr>\n"+			
			"<tr >\n"+
			"<td > <b> Id </b> </td>\n"+
			"<td> <b>"+session.getId()+" </b> </td> \n"+
            "</tr> \n"+			
			"<tr >\n"+
			"<td> <b> Creation Time </b> </td>\n"+
			"<td><b>"+ctime+"</b></td> \n"+
            "</tr> \n"+			
			"<tr >\n"+
			"<td> <b> Last Accessed Time </b></td>\n"+
			"<td><b>"+laTime+" </b></td> \n"+
            "</tr> \n"+			
			"<tr >\n"+
			"<td> <b> userID </b></td>\n"+
			"<td><b>"+userID+"</b></td> \n"+
            "</tr> \n"+	
            "<tr >\n"+
			"<td> <b>Number of visits </b></td>\n"+
			"<td><b>"+visitCount+"</b></td> \n"+
            "</tr> \n"+
            "<tr >\n"+
			"<td><b> Max Inactive Interval</b> </td>\n"+
			"<td><b>"+maxInact+"</b></td> \n"+
            "</tr> \n"+
  
             "</table>\n"+
             "<br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n"+
            "<input type=text style=\"float:right;width:20px\" id=\"text1\" value=\""+digit[1]+"\">\n"+ 
            "<input type=text style=\"float:right;width:20px\" id=\"text2\" value=\""+digit[2]+"\">\n"+ 
            "<input type=text style=\"float:right;width:20px\" id=\"text3\" value=\""+digit[3]+"\">\n"+ 
            "<input type=text style=\"float:right;width:20px\" id=\"text4\" value=\""+digit[4]+"\">\n"+ 
            
			"</body>\n"+
			"</html>\n"		
			);

}
}