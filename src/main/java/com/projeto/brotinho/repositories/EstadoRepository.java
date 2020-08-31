package com.projeto.brotinho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.brotinho.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

}
