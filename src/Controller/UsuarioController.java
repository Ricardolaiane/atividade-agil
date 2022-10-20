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

/**	public boolean verificaLogin(){
		
		Usuario login = new Usuario();
		login.setUser(view.getTxtUser().getText());
		login.setPassword(view.getTxtPassword().getText());
		try{
			Usuario loginBD = loginDao.busca();
			
			if(loginBD!=null){
				if(login.getUser().equals(loginBD.getUser())){
					System.out.println("comparou o login");
					JOptionPane.showConfirmDialog(null, "Login feito com sucesso!");
					return true;
				}
				else{
					return false;
				}
			}
			else{
				JOptionPane.showMessageDialog(null, "Usuário não existe!");
				//usuario nao existe
				return false;
			}
		}catch(Exception ex){
			System.out.println(ex);
			return false;
		} 
	}*/
}
