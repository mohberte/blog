package org.mohsoft.blog.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

@XmlRootElement 
public class Post {
	private int id;
	private String post;
	private Date created;
	private String author;
	
	 private List<Comment> comments = new ArrayList<>();
	
	 private List <Link> links = new ArrayList<Link>();
	
	public Post() {
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", post=" + post + ", created=" + created + ", author=" + author + ", comments="
				+ comments + ", links=" + links + "]";
	}

	public Post(int id, String post, String author) {
		this.id = id;
		this.post = post;
		this.created = new Date(id);
		this.author = author;
	}
	
	public Post(int id, String post, String author, List<Comment> comments) {
		super();
		this.id = id;
		this.post = post;
		this.author = author;
		this.created = new Date(id);
		this.comments = comments;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	@XmlTransient
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@XmlTransient
	public List<Comment> getComments() {
		return comments;
	}
	
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	public void addLink(String url, String rel)
	{
		Link link =  new Link();
		link.setLink(url);
		link.setRel(rel);
		links.add(link);
	}

	public Post(int id, String post, Date created, String author, List<Comment> comments,
			List<Link> links) {
		super();
		this.id = id;
		this.post = post;
		this.created = created;
		this.author = author;
		this.comments = comments;
		this.links = links;
	}
	public List<Link> getLinks() {
		return links;
	}
	public void setLinks(List<Link> links) {
		this.links = links;
	}
}
