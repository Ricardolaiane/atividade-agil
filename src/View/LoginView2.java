package View;


import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class LoginView2 {

	private JFrame frame;
	private JTextField txtPassword;
	private JTextField txtUser;
	private JButton btnLogin;


	public LoginView2() {
		frame = new JFrame();
		frame.setBounds(500, 500, 550, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		txtUser = new JTextField();
		txtUser.setText("User");
		txtUser.setFont(new Font("DejaVu Serif", Font.PLAIN, 14));
		txtUser.setForeground(new Color(0, 0, 0));
		txtUser.setBackground(new Color(255, 255, 255));
		txtUser.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setText("Password");
		txtPassword.setFont(new Font("DejaVu Serif", Font.PLAIN, 14));
		txtPassword.setColumns(10);
		
		btnLogin = new JButton("LOGIN");
		btnLogin.setForeground(new Color(0, 128, 0));
		btnLogin.setFont(new Font("DejaVu Serif", Font.PLAIN, 11));
		btnLogin.setBackground(Color.WHITE);
		
		
		JLabel lblNewLabel = new JLabel("");
		
		JLabel lblNewLabel_1 = new JLabel("EsseEuJ\u00E1Li!");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ricar\\eclipse-workspace\\Atividade-curso\\src\\util\\logo.jpg.jpg"));
		lblNewLabel_1.setFont(new Font("DejaVu Serif", Font.BOLD, 25));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(36)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 435, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtPassword, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
						.addComponent(txtUser, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
						.addComponent(btnLogin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE))
					.addContainerGap(23, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(76)
							.addComponent(lblNewLabel))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(34)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)))
					.addGap(156)
					.addComponent(txtUser, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addGap(48)
					.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
					.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(97))
		);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
		frame.setVisible(true);
	}


	public JButton getBtnLogin() {
		return btnLogin;
	}


	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}


	public JFrame getFrame() {
		return frame;
	}


	public void setFrame(JFrame frame) {
		this.frame = frame;
	}


	public JTextField getTxtPassword() {
		return txtPassword;
	}


	public void setTxtPassword(JTextField txtPassword) {
		this.txtPassword = txtPassword;
	}


	public JTextField getTxtUser() {
		return txtUser;
	}


	public void setTxtUser(JTextField txtUser) {
		this.txtUser = txtUser;
	}
	
}
