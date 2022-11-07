package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Livro;
import model.Usuario;



public class UsuarioDao {
    
  
	
	
	public List<Usuario> getAll(){


		String sql = "SELECT * FROM usuarios ORDER BY usuarios.pontos DESC";

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
	

	
	public Usuario buscaPessoaPorUser(Usuario usuario){
        String sql = "SELECT usuarios.user, usuarios.password, usuarios.nome FROM usuarios  where usuarios.user=? "
                + "AND usuarios.password=?";
        Usuario user = new Usuario();
      
        Connection connection = null;
      
        
        try{
            connection =  ConnectionFactory.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, user.getUser());
            stmt.setString(2, user.getPassword());
            
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                user = new Usuario();
                user.setUser(rs.getString("user"));
                user.setPassword(rs.getString("password"));
                user.setNome(rs.getString("nome"));
             
            }

        } catch (Exception e) {
            
            throw new RuntimeException("falha ao tentar executar um comando no BD. Verifique sua conexão"+ e.getMessage());
        }finally{
            try {
                connection.close();
                System.out.println("fechou a conexão");
            } catch (Exception e) {
                throw new RuntimeException("não foi possível fechar a conexão com o BD/busca senha");
            
            }
        }
        return user;
    }
	
	

}



 