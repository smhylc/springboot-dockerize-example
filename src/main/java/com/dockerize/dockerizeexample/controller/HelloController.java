package com.dockerize.dockerizeexample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Semih Yolcu
 * Created on 9.02.2023
 */


@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public ResponseEntity<String> hello() {
		return new ResponseEntity<>("Hello World!", HttpStatus.OK);
	}

}
