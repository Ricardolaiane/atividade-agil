package Controller;

import DAO.LivroDao;
import model.Livro;

public class LivrosController {
	
	public Livro livro;
	public LivroDao livroDao;
	
	
	public LivrosController(Livro livro, LivroDao livroDao) {
		this.livro = livro;
		this.livroDao = livroDao;
		eventos();
	}

	
	public void eventos() {
		
		
		
	}
}
