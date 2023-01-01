package org.mohsoft.blog.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mohsoft.blog.database.Database;
import org.mohsoft.blog.exception.DataNotFoundException;
import org.mohsoft.blog.model.Post;

public class PostService {
	
	private static Map<Integer, Post> posts = Database.getPosts();
	
	public PostService() {}

	public List<Post> getAllPosts(){
		
		return new ArrayList<Post>(posts.values());
	}

	public Post getPost(int id){
		
		List <Post> p = new ArrayList<Post>(posts.values());
		 Post post = p.get(id); 
		 if(post == null)
		 {
			 throw new DataNotFoundException("post with id " + id + " not found");
		 }
		 return post;
	}
}
