package Main;

import Controller.HomeController;
import DAO.LivroDao;
import DAO.UsuarioDao;
import View.Home;
import model.Usuario;

public class Main {
	
	public static void main(String[]args) {
		Usuario usuario = new Usuario();
		Home home = new Home();
		UsuarioDao usuarioDao = new UsuarioDao();
		HomeController homeController = new HomeController(home, usuario, usuarioDao);
		
		
		
		/*LivroDao dao2 = new LivroDao();
		System.out.println(dao2.getAll());
		
		UsuarioDao usuarioDao = new UsuarioDao();
		System.out.println(usuarioDao.getAll());*/
		
		
	}
}
