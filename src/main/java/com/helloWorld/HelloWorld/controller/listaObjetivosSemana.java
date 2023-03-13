package com.helloWorld.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista-objetivos-semana")
public class listaObjetivosSemana {
	@GetMapping
	public String listaObjetivosSemana() {
		return "Ler todas as documentações das aulas passadas, Praticar muito, Ser proativo no grupo do projeto ... ";
	}
	

}

