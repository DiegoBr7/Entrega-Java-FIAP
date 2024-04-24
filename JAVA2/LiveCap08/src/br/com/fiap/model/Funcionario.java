package br.com.fiap.model;

import java.time.LocalDate;

public class Funcionario {

	private int id ;
	private String nome ;
	private Double salario ;
	private LocalDate dataAdmissao ;
	private Departamento departemento ;
	public Funcionario() {
		
		
	}
	public Funcionario(int id, String nome, Double salario, LocalDate dataAdmissao, Departamento departemento) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		this.departemento = departemento;
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
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public Departamento getDepartemento() {
		return departemento;
	}
	public void setDepartemento(Departamento departemento) {
		this.departemento = departemento;
	}
	 
	
	
	
	
}
