package in.nareshit.raghu.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

	@GetMapping("/showa")
	public String showA() {
		if(new Random().nextInt(10)>6)
			throw new RuntimeException("DUMMY");
		return "Hello";
	}
	
	@GetMapping("/showb")
	public String showB() {
		if(new Random().nextInt(10)>6)
			throw new NotImplentedExcption("DUMMY");
		return "Hello";
	}
	
	@GetMapping("/showc")
	public String showC() {
		if(new Random().nextInt(10)>6)
			throw new NoAccessException("DUMMY");
		return "Hello";
	}
}
