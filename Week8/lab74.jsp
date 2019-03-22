<html>
<body>
<%
double num=Math.random();
if(num>0.5){
%>
<h2>you are lucky</h2><p>(<%=num %>)</p>
<%
}else{
	%>
	<h2>keep trying</h2><p>(<%=num%>) </p>
	<%
}
%>
<a href="<%=request.getRequestURI()%>">
<h3> try again</h3></a>

</body>
</html>