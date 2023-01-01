package org.mohsoft.blog.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mohsoft.blog.database.Database;
import org.mohsoft.blog.exception.DataNotFoundException;
import org.mohsoft.blog.model.Profile;

public class ProfileService {

	
	private static Map<String, Profile> profiles = Database.getProfiles();
	
	public ProfileService() {}
	
	public List<Profile> getAllProfiles(){
		
		return new ArrayList<Profile>(profiles.values());
	}
	
	public Profile getProfile(String id){
		
		if(profiles.get(id) == null)
		 {
			 throw new DataNotFoundException("Profile: " + id + " not found");
		 }
		return profiles.get(id);
	}
}
