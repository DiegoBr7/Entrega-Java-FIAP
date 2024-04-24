package br.com.fiap.model;

import java.time.LocalDate;

public class Funcionario {

	
	private int id ; 
	
	private String nome ;
	
	private double salario ; 
	
	private LocalDate dataAdmissao ; 
	
	private Departamento departamento ;

	public Funcionario() {
	
	}

	public Funcionario(int id, String nome, double salario, LocalDate dataAdmissao, Departamento departamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		this.departamento = departamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	} 
	
	
	
	
	
	
}
