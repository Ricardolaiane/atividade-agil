package Main;

import Controller.LoginController;
import DAO.UsuarioDao;
import View.LoginView;
import model.Usuario;

public class Main {

    public static void main(String[]args) {

        LoginView login = new LoginView();
        Usuario usuario = new Usuario();
        UsuarioDao usuarioDao = new UsuarioDao();
        LoginController loginController = new LoginController(login, usuario, usuarioDao);


    }
}
