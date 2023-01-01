package org.mohsoft.blog.model;

import java.util.List;

import jakarta.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Profile {

    private String profileName;
	private long id;
	private List<Post> postId;
    
    public Profile() {
    }

	public List<Post> getPostId() {
		return postId;
	}

	public void setPostId(List<Post> postId) {
		this.postId = postId;
	}

	public Profile(long id, String profileName, List<Post> postId) {
		this.id = id;
		this.profileName = profileName;
		this.postId = postId;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	@Override
	public String toString() {
		return "Profile [profileName=" + profileName + ", id=" + id + ", postId=" + postId + "]";
	}
    
}
