package View;


import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JList;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JToolBar;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import java.awt.ScrollPane;
import javax.swing.table.DefaultTableModel;

public class Home {

	private JFrame frameHome;
	private JPanel panel_estante;
	private JPanel panel_ranking;
	private JPanel panel_logo;
	private JPanel panel_login;
	private JButton btnLogout;
	private JLabel lblNome;
	private JList list_usuarios;
	private JScrollPane scrollPaneTabela;
	private JTable tabelaLivros;
	
	public Home() {
		frameHome = new JFrame();
		frameHome.getContentPane().setBackground(Color.WHITE);
		frameHome.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ricar\\eclipse-workspace\\Atividade-curso\\src\\util\\logo.jpg.jpg"));
		frameHome.setTitle("EsseEuJŠLi");
		frameHome.setBounds(500, 500, 750, 600);
		frameHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameHome.setLocationRelativeTo(null);
		
		panel_estante = new JPanel();
		panel_estante.setBackground(Color.WHITE);
		
		panel_ranking = new JPanel();
		panel_ranking.setBackground(Color.WHITE);
		
		panel_logo = new JPanel();
		panel_logo.setBackground(Color.WHITE);
		
		panel_login = new JPanel();
		panel_login.setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(frameHome.getContentPane());
		groupLayout.setHorizontalGroup(
		    groupLayout.createParallelGroup(Alignment.TRAILING)
		        .addGroup(groupLayout.createSequentialGroup()
		            .addContainerGap()
		            .addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
		                .addComponent(panel_ranking, 0, 0, Short.MAX_VALUE)
		                .addComponent(panel_logo, GroupLayout.PREFERRED_SIZE, 201, Short.MAX_VALUE))
		            .addPreferredGap(ComponentPlacement.UNRELATED)
		            .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
		                .addComponent(panel_estante, GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
		                .addComponent(panel_login, GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE))
		            .addContainerGap())
		);
		groupLayout.setVerticalGroup(
		    groupLayout.createParallelGroup(Alignment.TRAILING)
		        .addGroup(groupLayout.createSequentialGroup()
		            .addContainerGap()
		            .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
		                .addComponent(panel_logo, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
		                .addComponent(panel_login, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
		            .addPreferredGap(ComponentPlacement.RELATED)
		            .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
		                .addComponent(panel_estante, 0, 0, Short.MAX_VALUE)
		                .addComponent(panel_ranking, GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
		            .addGap(0))
		);
		
		JLabel lblNewLabel_2 = new JLabel("Estante");
		
		scrollPaneTabela = new JScrollPane();
		GroupLayout gl_panel_estante = new GroupLayout(panel_estante);
		gl_panel_estante.setHorizontalGroup(
		    gl_panel_estante.createParallelGroup(Alignment.LEADING)
		        .addGroup(gl_panel_estante.createSequentialGroup()
		            .addContainerGap()
		            .addGroup(gl_panel_estante.createParallelGroup(Alignment.LEADING)
		                .addComponent(scrollPaneTabela, GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
		                .addGroup(gl_panel_estante.createSequentialGroup()
		                    .addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
		                    .addContainerGap(421, Short.MAX_VALUE))))
		);
		gl_panel_estante.setVerticalGroup(
		    gl_panel_estante.createParallelGroup(Alignment.LEADING)
		        .addGroup(gl_panel_estante.createSequentialGroup()
		            .addGap(18)
		            .addComponent(lblNewLabel_2)
		            .addPreferredGap(ComponentPlacement.UNRELATED)
		            .addComponent(scrollPaneTabela, GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
		            .addContainerGap())
		);
		
		tabelaLivros = new JTable();
		tabelaLivros.setFont(new Font("DejaVu Serif", Font.PLAIN, 11));
		tabelaLivros.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		tabelaLivros.setFocusable(false);
		tabelaLivros.setIntercellSpacing(new java.awt.Dimension(0, 0));
		tabelaLivros.setRowHeight(50);
		tabelaLivros.setSelectionBackground(new java.awt.Color(204, 255, 204));
		tabelaLivros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		tabelaLivros.setShowHorizontalLines(true);
		tabelaLivros.setShowVerticalLines(false);
		tabelaLivros.getTableHeader().setReorderingAllowed(false);
		tabelaLivros.setVisible(true);
		scrollPaneTabela.setViewportView(tabelaLivros);
		panel_estante.setLayout(gl_panel_estante);
		
		btnLogout = new JButton("Logout");
		btnLogout.setFont(new Font("DejaVu Serif", Font.PLAIN, 11));
		btnLogout.setBackground(Color.GRAY);
		
		lblNome = new JLabel();
		GroupLayout gl_panel_login = new GroupLayout(panel_login);
		gl_panel_login.setHorizontalGroup(
			gl_panel_login.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_login.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNome)
					.addPreferredGap(ComponentPlacement.RELATED, 340, Short.MAX_VALUE)
					.addComponent(btnLogout)
					.addContainerGap())
		);
		gl_panel_login.setVerticalGroup(
			gl_panel_login.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_login.createSequentialGroup()
					.addGap(32)
					.addComponent(lblNome)
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_panel_login.createSequentialGroup()
					.addContainerGap(45, Short.MAX_VALUE)
					.addComponent(btnLogout)
					.addContainerGap())
		);
		panel_login.setLayout(gl_panel_login);
		
		JLabel lblNewLabel = new JLabel("EsseEuJaLi");
		lblNewLabel.setFont(new Font("DejaVu Serif", Font.PLAIN, 24));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ricar\\eclipse-workspace\\Atividade-curso\\src\\util\\book-solid.png"));
		GroupLayout gl_panel_logo = new GroupLayout(panel_logo);
		gl_panel_logo.setHorizontalGroup(
			gl_panel_logo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_logo.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_logo.setVerticalGroup(
			gl_panel_logo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_logo.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_logo.setLayout(gl_panel_logo);
		
		list_usuarios = new JList();
		list_usuarios.setBackground(Color.MAGENTA);
		list_usuarios.setFont(new Font("DejaVu Serif", Font.PLAIN, 14));
		list_usuarios.setSelectionBackground(new Color(46, 139, 87));
		list_usuarios.setBackground(new Color(152,251,152));
		list_usuarios.setFont(new Font("Segoe UI", Font.BOLD, 15));
		list_usuarios.setForeground(new Color(0, 0, 0));
		list_usuarios.setFixedCellHeight(50);
		list_usuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_usuarios.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JLabel lblNewLabel_1 = new JLabel("Ranking");
		lblNewLabel_1.setFont(new Font("DejaVu Serif", Font.PLAIN, 11));
		GroupLayout gl_panel_ranking = new GroupLayout(panel_ranking);
		gl_panel_ranking.setHorizontalGroup(
		    gl_panel_ranking.createParallelGroup(Alignment.LEADING)
		        .addGroup(gl_panel_ranking.createSequentialGroup()
		            .addContainerGap()
		            .addGroup(gl_panel_ranking.createParallelGroup(Alignment.LEADING)
		                .addComponent(list_usuarios, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
		                .addComponent(lblNewLabel_1))
		            .addContainerGap())
		);
		gl_panel_ranking.setVerticalGroup(
		    gl_panel_ranking.createParallelGroup(Alignment.LEADING)
		        .addGroup(gl_panel_ranking.createSequentialGroup()
		            .addGap(24)
		            .addComponent(lblNewLabel_1)
		            .addPreferredGap(ComponentPlacement.RELATED)
		            .addComponent(list_usuarios, GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
		            .addContainerGap())
		);
		panel_ranking.setLayout(gl_panel_ranking);
		frameHome.getContentPane().setLayout(groupLayout);
		frameHome.setVisible(true);
	}
	

	public JFrame getFrmEsseeujli() {
		return frameHome;
	}

	public void setFrmEsseeujli(JFrame frmEsseeujli) {
		this.frameHome = frmEsseeujli;
	}

	public JPanel getPanel_livros() {
		return panel_estante;
	}

	public void setPanel_livros(JPanel panel_livros) {
		this.panel_estante = panel_livros;
	}

	public JPanel getPanel_ranking() {
		return panel_ranking;
	}

	public void setPanel_ranking(JPanel panel_ranking) {
		this.panel_ranking = panel_ranking;
	}

	public JPanel getPanel() {
		return panel_logo;
	}

	public void setPanel(JPanel panel) {
		this.panel_logo = panel;
	}

	public JPanel getPanel_1() {
		return panel_login;
	}

	public void setPanel_1(JPanel panel_1) {
		this.panel_login = panel_1;
	}

	

	public JButton getbtnLogout() {
		return btnLogout;
	}


	public void setbtnLogout(JButton btnLogout) {
		this.btnLogout = btnLogout;
	}


	public JLabel getLblNome() {
        return lblNome;
    }


    public void setLblNome(JLabel lblNome) {
        this.lblNome = lblNome;
    }


    public JList getList_1() {
		return list_usuarios;
	}

	public void setList_1(JList list_1) {
		this.list_usuarios = list_1;
	}


	public JFrame getFrameHome() {
		return frameHome;
	}


	public void setFrameHome(JFrame frameHome) {
		this.frameHome = frameHome;
	}


	public JPanel getPanel_estante() {
		return panel_estante;
	}


	public void setPanel_estante(JPanel panel_estante) {
		this.panel_estante = panel_estante;
	}


	public JPanel getPanel_logo() {
		return panel_logo;
	}


	public void setPanel_logo(JPanel panel_logo) {
		this.panel_logo = panel_logo;
	}


	public JPanel getPanel_login() {
		return panel_login;
	}


	public void setPanel_login(JPanel panel_login) {
		this.panel_login = panel_login;
	}


	public JList getList_usuarios() {
		return list_usuarios;
	}


	public void setList_usuarios(JList list_usuarios) {
		this.list_usuarios = list_usuarios;
	}


    public JScrollPane getScrollPaneTabela() {
        return scrollPaneTabela;
    }


    public void setScrollPaneTabela(JScrollPane scrollPaneTabela) {
        this.scrollPaneTabela = scrollPaneTabela;
    }


    public JTable getTabelaLivros() {
        return tabelaLivros;
    }


    public void setTabelaLivros(JTable tabelaLivros) {
        this.tabelaLivros = tabelaLivros;
    }
	
}

