 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="org.mohsoft.blog.model.Profile" %>


<!DOCTYPE html>
<html>
<head>
<link href="css/style.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Profile profile  = (Profile) request.getAttribute("profile");


%><div class="profile-grid"><%
		for(int i=0;i<profile.getPostId().size();i++)
		{	String  post = profile.getPostId().get(i).getPost();%>
			
			<div class="post-grid">
			<%out.println(post);//displays the post
				for(int y=0;y<profile.getPostId().get(i).getComments().size();y++)
				{  String comment = profile.getPostId().get(i).getComments().get(y).getMessage();%>
					
					<div class="comment-grid"><%out.println(comment); //displays the comments%>
					</div><%} %>
			</div>
<%} %>
</div>
</body>
</html>