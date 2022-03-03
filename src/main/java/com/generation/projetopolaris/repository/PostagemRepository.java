package com.generation.projetopolaris.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.projetopolaris.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long> {

	public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);

}
