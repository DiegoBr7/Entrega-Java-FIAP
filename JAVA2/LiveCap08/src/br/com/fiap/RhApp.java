package br.com.fiap;

import java.time.LocalDate;

import br.com.fiap.dao.FuncionarioDao;
import br.com.fiap.dao.Conexao;
import br.com.fiap.model.Departamento;
import br.com.fiap.model.Funcionario;

public class RhApp {
	


	public static void main(String[] args) {
		
		
		Funcionario funcionario = new Funcionario();

	funcionario.setNome("John");
	funcionario.setSalario(3255.0);
	funcionario.setDataAdmissao(LocalDate.of(2024, 10, 10));
	
	
	funcionario.setDepartemento(new Departamento(2 , "Desenvolvimento"));
	
	
	FuncionarioDao funcionarioDao = new FuncionarioDao(Conexao.abrirConexao() );
	
	funcionarioDao.gravar(funcionario);
	
	}

}
