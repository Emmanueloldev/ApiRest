package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Cadastro;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Integer>{

}
