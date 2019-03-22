<html>
<body>
<h3>Select a player:</h3>
<form method="get">
<input type="checkbox" name="player" value="Raina">RAINA</br>
<input type="checkbox" name="player" value="Dhoni">DHONI</br>
<input type="submit" value="Query">
</form>
<%
String [] players=request.getParameterValues("player");
if(players!=null){
	%>
	<h3>Selected players:</h3>
	<ul>
	<%
	for(int i=0;i<players.length;++i){
		%>
		<li><%=players[i] %></li>
		<%
	}
	%>
	</ul>
	<a href=" <%=request.getRequestURI() %> ">
<% } %>
</body>
</html>