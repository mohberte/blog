<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="jakarta.ws.rs.client.WebTarget" %>
<%@ page import="jakarta.ws.rs.client.ClientBuilder" %>
<%@ page import="jakarta.ws.rs.client.Client" %>
<%@ page import="org.mohsoft.blog.model.Profile" %>
<%@ page import="java.util.List" %>
<%@ page import="jakarta.ws.rs.core.GenericType"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet">
</head>
<body>
<%	// Initialization of the client that will fetch the data
Client client = ClientBuilder.newClient();
WebTarget baseTarget = client.target("http://localhost:8080/blog/webapi/profiles/");
List<Profile> p = baseTarget.request().get(new GenericType<List<Profile>>(){});
%>
<div class="HomePage">
	<h1 class="app-name"> Blog Posts</h1>
	<div class="profiles-grid">
	<% 
	for(int i=0;i<p.size();i++){
	%><div class="profile-grid">
	<a href="postServlet?id=<%=p.get(i).getId()%>"><%
	out.println(p.get(i).getProfileName() + ": "+ p.get(i).getPostId().size()+" Entries ");
	%></a>
	</div><%}  %>
	</div>
</div>
</body>
</html>
