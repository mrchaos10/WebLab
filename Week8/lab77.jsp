<html>
<body>
<h3>Enter player details:</h3>
<form method="get">
<input type="text" name="player"></br>
<input type="text" name="player"></br>
<input type="text" name="player"></br>
<input type="text" name="player"></br>
<input type="text" name="player"></br>
<input type="password" name="player"></br>
<input type="submit" value="Query">
</form>
<%
String [] players=request.getParameterValues("player");
if(players!=null){
	%>
	<h3>Selected players:</h3>
	<table style="border: 1px solid black;"><tr>
	<%
	for(int i=0;i<players.length;++i){
		%>
		<td><%=players[i] %></td>
		<%
	}
	%>
	</tr></table>
	<a href=" <%=request.getRequestURI() %> ">
<% } %>
</body>
</html>