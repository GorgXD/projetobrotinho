package com.projeto.brotinho.dto;

import java.io.Serializable;

import com.projeto.brotinho.domain.Categoria;

public class CategoriaDTO implements Serializable {

	private static final long serialVersionUID = -407455804936506013L;

	private Long id;
	private String nome;

	public CategoriaDTO() {

	}

	public CategoriaDTO(Categoria obj) {
		id = obj.getId();
		nome = obj.getNome();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
