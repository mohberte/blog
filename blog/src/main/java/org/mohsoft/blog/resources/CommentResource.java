package org.mohsoft.blog.resources;
import java.util.List;

import org.mohsoft.blog.model.Comment;
import org.mohsoft.blog.service.CommentService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path(value = "/posts/{postId}/comments")
public class CommentResource {
	private CommentService commentService = new CommentService();
	
	@GET
	public List<Comment> getAllComments(@PathParam("postId") int postId) {
		return commentService.getAllComments(postId);
	}
	
	@GET
	@Path("/{commentId}")
	public Comment getMessage(@PathParam("postId") int postId, @PathParam("commentId") int commentId) {
		return commentService.getComment(postId, commentId);
	}
}
