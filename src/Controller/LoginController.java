package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import DAO.UsuarioDao;
import View.LoginView;
import model.Usuario;

public class LoginController {
    
    public LoginView loginView = new LoginView();
    public Usuario usuario;
    public UsuarioDao usuarioDao;
    
    
    public LoginController( LoginView loginView, Usuario usuario, UsuarioDao usuarioDao) {
        this.loginView = loginView;
        this.usuario = usuario;
        this.usuarioDao = usuarioDao;
        eventos();
    }
    
    public void eventos() {
        
        loginView.getBtnLogin().addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
              verificaLogin();
                
            }
        });
        
    }
    
    public boolean verificaLogin(){
        Usuario usuario = new Usuario();
        usuario.setUser(loginView.getTxtUser().getText());
        String senha = new String(loginView.getPasswordField().getPassword());
        usuario.setPassword(senha);
        
        try{
            Usuario usuarioBD = usuarioDao.buscaPessoaPorUser(usuario);
            if(usuarioBD!=null){
                
                if(usuario.getPassword().equals(usuarioBD.getPassword())) {
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
    }

}
