   package org.mohsoft.blog.resources;

import java.util.List;

import org.mohsoft.blog.model.Post;
import org.mohsoft.blog.service.PostService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.UriInfo;

@Path("posts")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,MediaType.TEXT_PLAIN})
@Consumes(MediaType.APPLICATION_JSON)
public class PostResource {

	PostService postService = new PostService();
	
	@GET
	public List<Post> getPosts()
	{
		return postService.getAllPosts();
	}
    
	@GET
	@Path("/{postId}")
	
	public Post getPost(@PathParam("postId") int id, @Context UriInfo uriInfo)
	{
		
		Post post =  postService.getPost(id);
		String uri = getUriForSelf(uriInfo, post);
		post.addLink(uri, "self");
		if(post.getLinks().isEmpty())
		{post.addLink(getUriForSelf(uriInfo, post), "self");
		post.addLink(getUriForProfile(uriInfo, post), "profile");
		post.addLink(getUriForComments(uriInfo, post), "comments");
		System.out.println(uriInfo);}
		return post;
	}

	private String getUriForComments(UriInfo uriInfo, Post post) {
		String uri = uriInfo.getBaseUriBuilder()
				//.path(PostResource.class)
				.path(PostResource.class, "getCommentResource")
				.path(CommentResource.class)
				.resolveTemplate("postId", post.getId())
				.build()
				.toString();
				return uri;
	}

	private String getUriForSelf(UriInfo uriInfo, Post post) {
		String uri = uriInfo.getBaseUriBuilder()
		.path(PostResource.class)
		.path(Long.toString(post.getId()))
		.build()
		.toString();
		return uri;
	}
	
	private String getUriForProfile(UriInfo uriInfo, Post post) {
		String uri = uriInfo.getBaseUriBuilder()
		.path(ProfileResource.class)
		.path(post.getAuthor())
		.build()
		.toString();
		return uri;
	}
	
	@GET
	@Path("/{postId}/comments")
	public  CommentResource getCommentResource()
	{
		return new CommentResource();
	}


}
