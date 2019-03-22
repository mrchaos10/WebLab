<%@ page import ="java.io.*,java.util.*"%>
<html>
<head>
<title>HIT COUNTER</title>
</head>
<body>
<%
Integer hitsCount=(Integer)application.getAttribute("hitsCounter");
if(hitsCount==null || hitsCount==0)
{
	out.println("Welcome");
	hitsCount=1;
}
else
{
	out.println("Again you're here");
	hitsCount+=1;
}
application.setAttribute("hitsCounter",hitsCount);
%>
<center>
<p><strong>Total Visits : <%=hitsCount%></p>
</center>
</body>
</html>