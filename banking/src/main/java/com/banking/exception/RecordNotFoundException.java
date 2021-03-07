package com.banking.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

/**
 * Excpetion handler for when requested resource isnt found
 * @author Gautham Bhonsle
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class RecordNotFoundException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Exception when record is not found
	 * @param message
	 */
	public RecordNotFoundException(String message) {
		super(message);

	}

}
