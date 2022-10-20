package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;

public class Home2 {

	private JFrame frmEsseeujli;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home2 window = new Home2();
					window.frmEsseeujli.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEsseeujli = new JFrame();
		frmEsseeujli.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ricar\\eclipse-workspace\\Atividade-curso\\src\\util\\logo.jpg.jpg"));
		frmEsseeujli.setTitle("EsseEuJ\u00E1Li");
		frmEsseeujli.setBounds(500, 500, 750, 600);
		frmEsseeujli.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_livros = new JPanel();
		panel_livros.setBackground(Color.WHITE);
		
		JPanel panel_ranking = new JPanel();
		panel_ranking.setBackground(Color.WHITE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(frmEsseeujli.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
						.addComponent(panel_ranking, GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_livros, GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_livros, Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
						.addComponent(panel_ranking, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
					.addGap(0))
		);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("DejaVu Serif", Font.PLAIN, 11));
		btnNewButton.setBackground(Color.GRAY);
		
		JLabel lblNewLabel_3 = new JLabel("Usu\u00E1rio");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.RELATED, 340, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(32)
					.addComponent(lblNewLabel_3)
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(45, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblNewLabel = new JLabel("EsseEuJaLi");
		lblNewLabel.setFont(new Font("DejaVu Serif", Font.PLAIN, 24));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ricar\\eclipse-workspace\\Atividade-curso\\src\\util\\book-solid.png"));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JScrollBar scrollBar = new JScrollBar();
		
		JLabel lblNewLabel_2 = new JLabel("Estante");
		lblNewLabel_2.setFont(new Font("DejaVu Serif", Font.PLAIN, 11));
		GroupLayout gl_panel_livros = new GroupLayout(panel_livros);
		gl_panel_livros.setHorizontalGroup(
			gl_panel_livros.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_livros.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_livros.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_livros.createSequentialGroup()
							.addComponent(scrollBar, GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_panel_livros.createSequentialGroup()
							.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(407))))
		);
		gl_panel_livros.setVerticalGroup(
			gl_panel_livros.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_livros.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2)
					.addGap(18)
					.addComponent(scrollBar, GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
					.addGap(8))
		);
		panel_livros.setLayout(gl_panel_livros);
		
		JList list_1 = new JList();
		list_1.setBackground(Color.MAGENTA);
		list_1.setFont(new Font("DejaVu Serif", Font.PLAIN, 14));
		
		JLabel lblNewLabel_1 = new JLabel("Ranking");
		lblNewLabel_1.setFont(new Font("DejaVu Serif", Font.PLAIN, 11));
		GroupLayout gl_panel_ranking = new GroupLayout(panel_ranking);
		gl_panel_ranking.setHorizontalGroup(
			gl_panel_ranking.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_ranking.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_ranking.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(list_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_ranking.setVerticalGroup(
			gl_panel_ranking.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_ranking.createSequentialGroup()
					.addGap(12)
					.addComponent(lblNewLabel_1)
					.addGap(18)
					.addComponent(list_1, GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_ranking.setLayout(gl_panel_ranking);
		frmEsseeujli.getContentPane().setLayout(groupLayout);
	}
}
