package com.itamp.ServiceImpl;

public class ExceptionHandler extends RuntimeException {

	public ExceptionHandler(String regiId) {
		super("not found registrationid :"+regiId );
	}

	public ExceptionHandler(String string, String username) {
		super(string+" " +username);	}
       
}
