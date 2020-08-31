package com.projeto.brotinho.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.brotinho.domain.Produto;
import com.projeto.brotinho.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repo;

	public Produto find(Long id) {
		Optional<Produto> obj = repo.findById(id);
		return obj.orElse(null);

	}
}