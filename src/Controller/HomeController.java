package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

import DAO.LivroDao;
import DAO.UsuarioDao;
import View.Home;
import View.LoginView2;
import View.PainelLivros2;
import model.Livro;
import model.Usuario;

public class HomeController {

	public Home homeView;
	public Livro livro;
	public Usuario usuario;
	public UsuarioDao usuarioDao;
	public LivroDao livroDao = new LivroDao();
	public JList listaLivros = new JList();
	public JList listaUsuarios = new JList();
 	public DefaultListModel listaUsuariosModel = new DefaultListModel<>();
	public DefaultListModel listaLivrosModel = new DefaultListModel<>();
	public PainelLivros2 painelLivros2; 


	public HomeController(Home homeView, Usuario usuario, UsuarioDao usuarioDao) {
		this.homeView = homeView;
		this.usuario = usuario;
		this.usuarioDao = usuarioDao;
		initComponentsModel();
		eventos();
		showLivros();

	}

	public void eventos() {
		homeView.getBtnLogin().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginView2 loginView = new LoginView2();

			}
		});

	}

	public void initComponentsModel() {
		listaUsuariosModel = new DefaultListModel<Usuario>();
		loadUsuarios();
		if(!listaUsuariosModel.isEmpty()) {
			homeView.getList_usuarios().setSelectedIndex(0);
			int usuarioIndex = homeView.getList_usuarios().getSelectedIndex();
			Usuario usuario = (Usuario) listaUsuariosModel.get(usuarioIndex);


		}


	}

	private void loadUsuarios() {
		List<Usuario> usuarios = usuarioDao.getAll();

		listaUsuariosModel.clear();

		for (int i = 0; i < usuarios.size(); i++) {
			listaUsuariosModel.addElement(usuarios.get(i));
			homeView.getList_usuarios().setModel(listaUsuariosModel);
		}


	}

	private void loadLivros() {

		List<Livro> livros = livroDao.getAll();
		PainelLivros2 livroIndividual = new PainelLivros2();
		homeView.getScrollPane_livros().add(livroIndividual);
		System.out.println("adiciona figura");

	}


	private void showLivros() {

		List<Livro> livros = livroDao.getAll();
		
		PainelLivros2 livroIndividual = new PainelLivros2();
		for(int i = 0; i<livros.size(); i++) {
			listaLivrosModel.addElement(livros.get(i));
			homeView.getScrollPane_livros().setViewportView(livroIndividual);
			
			
			
		}
	}
}