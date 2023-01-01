package org.mohsoft.blog.servlet;

import java.io.IOException;
import java.util.List;

import org.mohsoft.blog.model.Profile;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;

public class postServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public postServlet() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
		
		Client client = ClientBuilder.newClient();
		WebTarget baseTarget = client.target("http://localhost:8080/blog/webapi/profiles/");
		List<Profile> p = baseTarget.request().get(new GenericType<List<Profile>>(){});
		
		Profile profile = null;
		for(int i=0;i<p.size();i++) 
		if(p.get(i).getId()==Integer.valueOf(request.getParameter("id")))
		{
		profile = p.get(i);
		}
	    	String destPage = "postPage.jsp";
	    	
	        RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
	        
	        request.setAttribute("profile",(Profile) profile);
	        
	        dispatcher.forward(request, response);
	}

}
