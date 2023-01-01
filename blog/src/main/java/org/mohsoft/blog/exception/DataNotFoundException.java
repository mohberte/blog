package org.mohsoft.blog.exception;

public class DataNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 569288262943856172L;

	public DataNotFoundException(String message) {
		super(message);
	}
}
