package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.model.Funcionario;

public class FuncionarioDao {

private Connection conexao ; 




	public FuncionarioDao(Connection conexao) {
	
	this.conexao = conexao;
	
}


	public void gravar(Funcionario funcionario) {

		
		//preparando SQL;
		
		String sql = "insert into tb_funcionario (id , nome , salario , data_admissao , departamento_id )"+ 
				"values ( sq_fun.nextval , ? , ? , ? , ?   )";
	
	
	
	// classes para enviar as instrucoes ao DB
	
	
	try{
		
		
		PreparedStatement ps = conexao.prepareStatement(sql);
		ps.setString(1, funcionario.getNome());
		ps.setDouble(2, funcionario.getSalario());
	
		//data no Oracle é DATE e no Java LocalDate
		//precisamos converter
		//Fate do Java.sql
		//valueOf - converte
	
		
		Date data = Date.valueOf(funcionario.getDataAdmissao());
		ps.setDate(3, data);
		ps.setInt(4,funcionario.getDepartamento().getId());
	
		//enviar o comando para DB
		
		ps.execute();
		
		//fecha o statement
		ps.close();
		
		//fecha a conexao
		conexao.close();
		
		System.out.println("Registro inserido com sucesso!");
		
	}catch(SQLException e){
		
		e.printStackTrace();
		
	}
	}

	public void excluir(Funcionario funcionario) {

	}


	public void atualizar(Funcionario funcionario) {

	}


	public List<Funcionario> listarTodos() {
 
		String sql = "SELECT * FROM tb_funcionario ORDER BY id";
		
		List<Funcionario> list = new ArrayList<Funcionario>();
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			//resultado -> ResultSet
			// manda executar no DB
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Funcionario funcionario = new Funcionario();
				funcionario.setId(rs.getInt("id")); // nome da coluna no DB
				funcionario.setNome(rs.getString("nome"));
				funcionario.setSalario(rs.getDouble("salario"));
				
				Date data = rs.getDate("data admissao");
				funcionario.setDataAdmissao(data.toLocalDate());
				
				int idDepartamento = rs.getInt("departamento_id");
			
			
			}
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
		
	}

	public void buscarFuncionarioPorId(int id) {

	}
}
