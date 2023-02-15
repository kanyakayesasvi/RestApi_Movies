package com.Handson.Movies.Exception;



public class MovieException extends RuntimeException {
	private static final long serialVersionID=1L;
	public MovieException(String message) {
		super(message);
		
		
				
				
	}
	public MovieException(String message, Throwable throwable) {
		super(message,throwable);
	}
}
