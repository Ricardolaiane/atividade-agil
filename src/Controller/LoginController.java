package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import DAO.UsuarioDao;
import View.Home;
import View.LoginView;
import model.Usuario;

public class LoginController {

    public LoginView loginView;
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
                loginView.getFrame().dispose();


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


            if(usuario!=null){

                UsuarioDao dao = new UsuarioDao();
                Home home = new Home();
                HomeController homeController = new HomeController(home, usuarioBD, dao);  
                home.getLblNome().setText(usuarioBD.getNome());
                return true;

            }
            else{
                JOptionPane.showMessageDialog(null, "Usuário não existe!");

                return false;
            }
        }catch(Exception ex){
            System.out.println(ex);
            return false;
        } 
    }

}
