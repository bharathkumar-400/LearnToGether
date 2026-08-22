package com.Bharath.learntogether.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Bharath.learntogether.dto.ErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public ErrorResponse handleRuntimeException(RuntimeException ex) {
		 return new ErrorResponse(LocalDateTime.now(),HttpStatus.BAD_REQUEST.value(),ex.getMessage());
                
	}
	

}
