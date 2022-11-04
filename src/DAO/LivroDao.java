package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Livro;

public class LivroDao {
	
    public List<Livro> buscaLivros(){
        
        
        String sql = "SELECT * FROM livros;";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Livro> livros = new ArrayList<Livro>();
        
        try {
            //criação da conexão
            connection = ConnectionFactory.getConnection();
            
            //preparando a consulta
            statement = connection.prepareStatement(sql);
            
            //passando dados da query para a variável do tipo ResultSet
            resultSet = statement.executeQuery();
            
            while(resultSet.next()) {
                Livro livro = new Livro();
                livro.setId(resultSet.getInt("id"));
                livro.setTitulo(resultSet.getString("titulo"));
                livro.setQtdPaginas(resultSet.getInt("qtdPaginas"));
                livro.setGenero(resultSet.getString("genero"));
                
                livros.add(livro);
                
            }
        
        }catch(Exception e) {
            throw new RuntimeException("Erro ao buscar livros " + e.getMessage(), e);
        }finally {
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }
        
        return livros;
        
    }
	public List<String> getAll(){
			
			
			String sql = "SELECT * FROM livros;";
			
			Connection connection = null;
			PreparedStatement statement = null;
			ResultSet resultSet = null;
			
			List<String> livros = new ArrayList<String>();
			
			try {
				//criação da conexão
				connection = ConnectionFactory.getConnection();
				
				//preparando a consulta
				statement = connection.prepareStatement(sql);
				
				//passando dados da query para a variável do tipo ResultSet
				resultSet = statement.executeQuery();
				
				while(resultSet.next()) {
					Livro livro = new Livro();
					livro.setId(resultSet.getInt("id"));
					livro.setTitulo(resultSet.getString("titulo"));
					livro.setQtdPaginas(resultSet.getInt("qtdPaginas"));
					livro.setGenero(resultSet.getString("genero"));
					
					livros.add(livro.toString());
					
				}
			
			}catch(Exception e) {
				throw new RuntimeException("Erro ao buscar livros " + e.getMessage(), e);
			}finally {
				ConnectionFactory.closeConnection(connection, statement, resultSet);
			}
			
			return livros;
			
		}
	
	public List<String> buscaPaginas(){
        
        
        String sql = "SELECT * FROM livros;";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<String> livros = new ArrayList<String>();
        
        try {
            //criação da conexão
            connection = ConnectionFactory.getConnection();
            
            //preparando a consulta
            statement = connection.prepareStatement(sql);
            
            //passando dados da query para a variável do tipo ResultSet
            resultSet = statement.executeQuery();
            
            while(resultSet.next()) {
                Livro livro = new Livro();
                livro.setQtdPaginas(resultSet.getInt("qtdPaginas"));
                livros.add(livro.toString());
                
            }
        
        }catch(Exception e) {
            throw new RuntimeException("Erro ao buscar livros " + e.getMessage(), e);
        }finally {
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }
        
        return livros;
        
    }

	
		
	
	}


/*
 * 	
*/
 