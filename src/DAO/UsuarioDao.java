package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Usuario;



public class UsuarioDao {
	
	
	public List<Usuario> getAll(){


		String sql = "SELECT * FROM usuarios";

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		List<Usuario> usuarios = new ArrayList<Usuario>();

		try {
			//criação da conexão
			connection = ConnectionFactory.getConnection();

			//preparando a consulta
			statement = connection.prepareStatement(sql);

			//passando dados da query para a variável do tipo ResultSet
			resultSet = statement.executeQuery();

			while(resultSet.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(resultSet.getInt("id"));
				usuario.setNome(resultSet.getString("nome"));
				usuario.setPassword(resultSet.getString("password"));
				usuario.setUser(resultSet.getString("user"));
				usuario.setPontos(resultSet.getInt("pontos"));

				usuarios.add(usuario);


			}

		}catch(Exception e) {
			throw new RuntimeException("Erro ao buscar usuarios" + e.getMessage(), e);
		}finally {
			ConnectionFactory.closeConnection(connection, statement, resultSet);
		}

		return usuarios;

	}
	
	public List<Usuario> getNome(){


		String sql = "SELECT usuarios.nome FROM usuarios";

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		List<Usuario> usuarios = new ArrayList<Usuario>();

		try {
			//criação da conexão
			connection = ConnectionFactory.getConnection();

			//preparando a consulta
			statement = connection.prepareStatement(sql);

			//setando o dado pedido
			//statement.setInt(1, idProject);

			//passando dados da query para a variável do tipo ResultSet
			resultSet = statement.executeQuery();

			while(resultSet.next()) {
				Usuario usuario = new Usuario();
				usuario.setNome(resultSet.getString("nome"));
				usuarios.add(usuario);


			}

		}catch(Exception e) {
			throw new RuntimeException("Erro ao buscar projetos" + e.getMessage(), e);
		}finally {
			ConnectionFactory.closeConnection(connection, statement, resultSet);
		}

		return usuarios;

	}
	
	

}



 