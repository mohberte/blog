package org.mohsoft.blog.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mohsoft.blog.database.Database;
import org.mohsoft.blog.model.Comment;
import org.mohsoft.blog.model.Post;

public class CommentService {
	
	private Map<Integer, Post> posts = Database.getPosts();
	
	public List<Comment> getAllComments(int postId){
		
	List<Comment> comments = posts.get(postId).getComments();
	return new ArrayList<Comment>(comments);
	}
	
	public Comment getComment(int postId, int commentId){
		
		Comment comment = posts.get(postId).getComments().get(commentId);
		return comment;
		}
}

