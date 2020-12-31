package com.appsdeveloperblog.photoapp.api.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloResource {

	private HelloService helloService;

	public HelloResource(HelloService helloService) {
		this.helloService = helloService;
	}

	@GetMapping
	public String helloWorld() {
		return helloService.hello();
	}
}