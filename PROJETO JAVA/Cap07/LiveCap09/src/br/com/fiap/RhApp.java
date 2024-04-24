package br.com.fiap;

import java.time.LocalDate;


public class RhApp {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario() ;

		funcionario.setNome("John");

		funcionario.setSalario(3000.00);

		funcionario.setDataAdmissao(LocalDate.of(2023, 10, 11));

		funcionario.setDepartamento(new Departamento(2 , "Desenvolvimento"));

		FuncionarioDao funcioanarioDao = new funcionarioDao();

		funcionarioDao.gravar(funcionario);

	}
	
}
