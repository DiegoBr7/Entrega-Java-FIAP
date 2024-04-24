package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521/ORCL";
	private static final String USUARIO = "RM553090";
	private static final String SENHA = "270695";

	public static Connection abrirConexao(){

		Connection conexao = null ; 

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			conexao = DriverManager.getConnection(URL , USUARIO , SENHA);
		}catch(ClassNotFoundException e) {


			System.err.println("Erro de conexao");

			e.printStackTrace();

			//TODO Auto-generated catch block

		}catch(SQLException e) {


			System.err.println(" Erro de conexao de usuario , senha ou URL invalido");

			e.printStackTrace();
			//TODO Auto-generated catch block

		}

System.out.println("Conectado com successo !!!");
		return conexao;
	}

}


