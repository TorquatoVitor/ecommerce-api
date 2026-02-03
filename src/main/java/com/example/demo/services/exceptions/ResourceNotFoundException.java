package com.example.demo.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	public ResourceNotFoundException(Object id) {
		super("Recurso nao econtrado. ID: " + id);
	}
}
