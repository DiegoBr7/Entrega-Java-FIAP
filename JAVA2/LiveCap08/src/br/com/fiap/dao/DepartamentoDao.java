package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.model.Departamento;

public class DepartamentoDao {


	private Connection conexao;



	public DepartamentoDao(Connection conexao) {
		this.conexao = conexao;
	}

	public void gravar(Departamento departamento) {

	}



	public void excluir(Departamento departamento) {

	}



	public void atualizar(Departamento departamento) {

	}



	public void listarTodos(Departamento departamento) {

	}

	public Departamento buscarDepartamentoPorId(int id) {

		String sql = "SELECT * FROM tb_departamento WHERE id = ?";
		Departamento departamento = new Departamento();

		try {
			PreparedStatement ps = conexao.prepareStatement(sql);

			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				departamento.setId(rs.getInt("id"));
				departamento.setNome(rs.getString("nome"));
			}

			ps.close();
			rs.close();
			conexao.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}

		return departamento;

	}




public Departamento buscarDepartamentoPorNome(String nome) {

	String sql = "SELECT * FROM tb_departamento WHERE UPPER(nome) LIKE UPPER (?) ";
	Departamento departamento = new Departamento();

	try {
		PreparedStatement ps = conexao.prepareStatement(sql);

		ps.setString(1, "%" + nome + "%");

		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			departamento.setId(rs.getInt("id"));
			departamento.setNome(rs.getString("nome"));
		}

		ps.close();
		rs.close();
		conexao.close();

	} catch (SQLException e) {
		System.out.println(e.getMessage());

	}

	return departamento;
}
}