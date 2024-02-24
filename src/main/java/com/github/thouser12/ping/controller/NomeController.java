package com.github.thouser12.ping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NomeController {
	
	@GetMapping("/nome")
	public String ping() {
		return "Thomas";
	}

}
