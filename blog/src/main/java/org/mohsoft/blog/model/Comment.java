package org.mohsoft.blog.model;

public class Comment {
	@Override
	public String toString() {
		return "Comment [id=" + id + ", message=" + message + "]";
	}
	private int id;
    private String message;
    
    
    public Comment()
    {}
    
	public Comment(int id, String message) {
		super();
		this.id = id;
		this.message = message;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
    
}
