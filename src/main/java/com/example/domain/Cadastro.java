package com.example.domain;

import java.util.Objects;

public class Cadastro {

	private long id;
	private String name;
	private String cpf;
	
	public Cadastro() {
		
	}
	
	public Cadastro(long id, String name, String cpf) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cadastro other = (Cadastro) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Cadastro [id=" + id + ", name=" + name + ", cpf=" + cpf + "]";
	}
	
	
	
	
}
