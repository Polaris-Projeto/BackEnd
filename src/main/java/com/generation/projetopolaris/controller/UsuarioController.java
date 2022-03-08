package com.generation.projetopolaris.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.projetopolaris.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;

//	@GetMapping
//	
//	@GetMapping("/{id}")
//	
//
//	@GetMapping("/nome/{nome}")
//	
//	@PostMapping
//	
//
//	@PutMapping
//	
//	@DeleteMapping("/{id}")
//	
}
