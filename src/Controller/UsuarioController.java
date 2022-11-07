package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import DAO.UsuarioDao;
import View.LoginView;
import model.Usuario;

public class UsuarioController {
	
	private LoginView view;
	private Usuario login = new Usuario();
	private UsuarioDao loginDao = new UsuarioDao();
	
	public UsuarioController(LoginView view, Usuario login){
		this.view = view;
		this.login = login;
		eventos();
	}
	
	public void eventos() {
		
	}

}
