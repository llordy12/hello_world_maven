package com.generation.helloworld.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	

    @GetMapping("/bsm")
    public List<String> listBsm() {
        return List.of(
                "Proatividade",
                "Orientação ao Futuro",
                "Trabalho em Equipe",
                "Responsabilidade Pessoal",
                "Comunicação",
                "Mentalidade de Crescimento",
                "Persistencia",
                "Atenção aos Detalhes"
        );
    }


    @GetMapping("/objetivos")
    public List<String> listObjetivos() {
        return List.of(
                "Aprender conceitos de maven e spring",
                "praticar muito sobre controllers e endpoints",
                "começar meu blog pessoal"
        );
    }
 
}