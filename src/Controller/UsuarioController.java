package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import DAO.UsuarioDao;
import View.LoginView2;
import model.Usuario;

public class UsuarioController {
	
	private LoginView2 view;
	private Usuario login = new Usuario();
	private UsuarioDao loginDao = new UsuarioDao();
	
	public UsuarioController(LoginView2 view, Usuario login){
		this.view = view;
		this.login = login;
		eventos();
	}
	
	public void eventos() {
		view.getBtnLogin().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		//		verificaLogin();
				
			}
			
		});
	}

}
