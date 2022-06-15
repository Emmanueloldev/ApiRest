package com.example.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Cadastro;
import com.example.repositories.CadastroRepository;

@RestController
@RequestMapping(value = "/clientes")
public class CadastroResource {

	@Autowired
	private CadastroRepository cadastroRepo;

	@GetMapping
	private List<Cadastro> listar() {

		Cadastro cadastro1 = new Cadastro(null, "Eu", "00000000000");
		Cadastro cadastro2 = new Cadastro(null, "Tu", "11111111111");

		List<Cadastro> lista = new ArrayList<>();

		lista.add(cadastro1);
		lista.add(cadastro2);

		return cadastroRepo.findAll();

	}
}