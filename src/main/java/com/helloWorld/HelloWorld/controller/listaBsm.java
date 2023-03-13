package com.helloWorld.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista-bsm")
public class listaBsm {
	@GetMapping
	
	public String listaBsm() {
		return "Persistência, Comunicação, Proatividade, Gestão do Tempo, entre outras... ";
	}
	

}

