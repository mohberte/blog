package org.mohsoft.blog.resources;


import java.util.List;

import org.mohsoft.blog.model.Profile;
import org.mohsoft.blog.service.ProfileService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/profiles")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class ProfileResource {

	ProfileService profileService = new ProfileService();
	
	@GET
	public List<Profile> getProfiles()
	{
		return profileService.getAllProfiles();
	}

	@GET
	@Path("/{profileName}")
	
	public Profile getProfile(@PathParam("profileName") String profileName)
	{
		return profileService.getProfile(profileName);
	}
}
