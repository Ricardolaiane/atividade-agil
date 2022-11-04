package Main;

import Controller.LoginController;
import DAO.UsuarioDao;
import View.LoginView;
import model.Usuario;

public class Main {
	
	public static void main(String[]args) {
		/**Usuario usuario = new Usuario();
		Home home = new Home();
		UsuarioDao usuarioDao = new UsuarioDao();
		HomeController homeController = new HomeController(home, usuario, usuarioDao);*/
	    
	    LoginView login = new LoginView();
	    Usuario usuario = new Usuario();
	    UsuarioDao usuarioDao = new UsuarioDao();
	    LoginController loginController = new LoginController(login, usuario, usuarioDao);
		
		
		
		/*LivroDao dao2 = new LivroDao();
		System.out.println(dao2.getAll());
		
		UsuarioDao usuarioDao = new UsuarioDao();
		System.out.println(usuarioDao.getAll());*/
		
		
	}
}
