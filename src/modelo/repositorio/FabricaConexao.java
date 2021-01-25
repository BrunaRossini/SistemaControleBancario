package modelo.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {

	protected Connection conexao;

	public FabricaConexao() {

		
		String url = "jdbc:postgresql://localhost/sistemacontrolebancario";
		Properties props = new Properties();
		props.setProperty("user", "postgres");
		props.setProperty("password", "ul2021");
		props.setProperty("ssl", "false");	
		try {
			this.conexao = DriverManager.getConnection(url, props);
			System.out.println("Conex�o estabelecida!");
			} catch (SQLException e) {
			System.out.println("Erro ao criar uma conex�o!" + e.getMessage());
		}

	}
	
	public void fecharConexao() {
		try {
			  if (this.conexao != null) {
				  conexao.close();
				  System.out.println("Conex�o fechada com sucesso!");
			  }
		}catch (SQLException e) {
			System.out.println("Erro ao fechar a conex�o!" + e.getMessage());
		}
	}

}
