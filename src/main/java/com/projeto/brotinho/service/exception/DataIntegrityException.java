package com.projeto.brotinho.service.exception;

public class DataIntegrityException extends RuntimeException {

	private static final long serialVersionUID = -3493196844193034314L;

	public DataIntegrityException(String msg) {
			super(msg);
		}

	public DataIntegrityException(String msg, Throwable cause) {
			super(msg, cause);
		}

}
