package model;



public class Usuario {
	
	private int id;
	private String user;
	private String password;
	private String nome;
	private int pontos;
	
	public Usuario(String user,  String password, String nome,int pontos ) {
		super();
		this.user = user;
		this.password = password;
		this.nome = nome;
		this.pontos = pontos;
		
	}
	
	public Usuario() {
		
	}
	
	@Override
	public String toString() {
		return  this.nome + " - "+ this.pontos +"  " + "pontos";
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
