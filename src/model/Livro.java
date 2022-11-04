package model;

public class Livro {
	
	private int id;
	private String titulo;
	private String genero;
	private int qtdPaginas;
	private boolean isCompleted;
	
	
	public Livro() {
	  
	    
	}
	


	@Override
    public String toString() {
        return "Livro [id=" + id + ", titulo=" + titulo + ", genero=" + genero + ", qtdPaginas=" + qtdPaginas
                + ", isCompleted=" + isCompleted + "]";
    }



    public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getQtdPaginas() {
		return qtdPaginas;
	}
	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

   
	
	
	

}
