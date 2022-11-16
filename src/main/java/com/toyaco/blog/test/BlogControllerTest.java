package com.toyaco.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogControllerTest {

	// http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<H1>Hello~ 스프링 부트!123!</H1>";
	}

}