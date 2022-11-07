package Controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import DAO.LivroDao;
import DAO.UsuarioDao;
import View.Home;
import View.LivroView;
import View.TrofeuView;
import model.Livro;
import model.Usuario;
import util.TabelaLivrosModel;



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
    public TabelaLivrosModel tabelaLivrosModel = new TabelaLivrosModel();


    public HomeController(Home homeView, Usuario usuario, UsuarioDao usuarioDao) {
        this.homeView = homeView;
        this.usuario = usuario;
        this.usuarioDao = usuarioDao;
        initComponentsModel();
        loadLivros();
        decorateTabelaLivros();
        eventos();
      
    }

    public void eventos() {
        homeView.getbtnLogout().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {    
                homeView.getFrameHome().dispose(); 
            }
        });

        homeView.getTabelaLivros().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                
                jTableLivrosMouseClicked(evt);
             
             
                
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

        List<Livro> livros = livroDao.buscaLivros();
        homeView.getTabelaLivros().setModel(tabelaLivrosModel);
        tabelaLivrosModel.setLivros(livros);
        homeView.getScrollPaneTabela().setVisible(true);

    }


    private void decorateTabelaLivros() {
        //To style table header
        homeView.getTabelaLivros().getTableHeader().setFont(new Font("Dejavu Serif", Font.BOLD, 14));
        homeView.getTabelaLivros().getTableHeader().setOpaque(false);
        homeView.getTabelaLivros().getTableHeader().setBackground(new Color(0, 153, 102));
        homeView.getTabelaLivros().getTableHeader().setForeground(new Color(255, 255, 255));
        //Auto sort dos items da jTable
        homeView.getTabelaLivros().setAutoCreateRowSorter(true);



        //Add event 
        homeView.getTabelaLivros().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int rowIndex =   homeView.getTabelaLivros().rowAtPoint(evt.getPoint());
                int columnIndex =   homeView.getTabelaLivros().columnAtPoint(evt.getPoint());

                if(columnIndex ==3) {
                    Livro livro = tabelaLivrosModel.getLivros().get(rowIndex);
                }
            }
        });
    }



    private void jTableLivrosMouseClicked(java.awt.event.MouseEvent evt) {
        int rowIndex = homeView.getTabelaLivros().rowAtPoint(evt.getPoint());
        int columnIndex = homeView.getTabelaLivros().columnAtPoint(evt.getPoint());
        Livro livro = tabelaLivrosModel.getLivros().get(rowIndex);
        

        switch (columnIndex) {
            case 0:
              
                LivroDao dao = new LivroDao();
                LivroView tela = new LivroView();
                LivrosController livros = new LivrosController(livro, dao, tela);
                tela.getFrmLivro().setVisible(true);
                tela.getLblTitulo().setText(livro.getTitulo());
            
                break;
            case 1:
                
                break;
            case 3:
                LivroDao lidao = new LivroDao();
                lidao.update(livro);
                TrofeuView trofeu = new TrofeuView();
                trofeu.getFrame().setVisible(true);
                trofeu.getLblGenero().setText(livro.getGenero());
                livroDao.updatePontos(livro);
                loadUsuarios();
                
                break;
            default:
                System.out.println("Erro");
                break;
        }

    }  
    
    public void calculoDePontos(Livro livro) {
       
      if(livro.getQtdPaginas()==72) {
         livroDao.updatePontos(livro);
      
      }
      else if(livro.getQtdPaginas()%100 == 0) {
          livroDao.updatePontos(livro);
          
      }
        
    }

}
