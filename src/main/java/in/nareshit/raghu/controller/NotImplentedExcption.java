package in.nareshit.raghu.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_IMPLEMENTED)
public class NotImplentedExcption extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public NotImplentedExcption() {
		super();
	}
	public NotImplentedExcption(String message) {
		super(message);
	}
}
