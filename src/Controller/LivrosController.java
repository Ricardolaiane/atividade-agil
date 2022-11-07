package Controller;



import DAO.LivroDao;
import View.LivroView;
import model.Livro;

public class LivrosController {
	
	public Livro livro;
	public LivroDao livroDao;
	public LivroView tela;
	
	
	public LivrosController(Livro livro, LivroDao livroDao, LivroView tela) {
		this.livro = livro;
		this.livroDao = livroDao;
		this.tela = tela;
		
	}

	
	
}
