package com.generation.projetopolaris.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.generation.projetopolaris.model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);

	public ResponseEntity<List<Tema>> findAllByDescricao(String descricao);

	public ResponseEntity<Tema> findByDescricao(String descricao);
}
