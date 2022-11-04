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
import javax.swing.JPasswordField;
import javax.swing.border.TitledBorder;

public class LoginView {

	private JFrame frame;
	private JTextField txtUser;
	private JPasswordField passwordField;
	private JButton btnLogin;

	public LoginView() {
		frame = new JFrame();
		frame.setBounds(500, 500, 407, 608);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
		    groupLayout.createParallelGroup(Alignment.LEADING)
		        .addGroup(groupLayout.createSequentialGroup()
		            .addContainerGap()
		            .addComponent(panel, GroupLayout.PREFERRED_SIZE, 366, GroupLayout.PREFERRED_SIZE)
		            .addContainerGap(133, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
		    groupLayout.createParallelGroup(Alignment.LEADING)
		        .addGroup(groupLayout.createSequentialGroup()
		            .addContainerGap()
		            .addComponent(panel, GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
		            .addContainerGap())
		);
		
		txtUser = new JTextField();
		txtUser.setBorder(new TitledBorder(null, "Usu\u00E1rio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		txtUser.setFont(new Font("DejaVu Serif", Font.PLAIN, 14));
		txtUser.setForeground(new Color(0, 0, 0));
		txtUser.setBackground(new Color(255, 255, 255));
		txtUser.setColumns(10);
		
		btnLogin = new JButton("LOGIN");
		btnLogin.setForeground(new Color(0, 128, 0));
		btnLogin.setFont(new Font("DejaVu Serif", Font.PLAIN, 11));
		btnLogin.setBackground(Color.WHITE);
		
		
		JLabel lblNewLabel = new JLabel("");
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ricar\\eclipse-workspace\\Atividade-curso\\src\\util\\logo.jpg.jpg"));
		lblNewLabel_1.setFont(new Font("DejaVu Serif", Font.BOLD, 25));
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new TitledBorder(null, "Senha", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		passwordField.setFont(new Font("DejaVu Serif", Font.PLAIN, 11));
		
		JLabel lblNewLabel_2 = new JLabel("EsseEuJ\u00E1Li");
		lblNewLabel_2.setFont(new Font("DejaVu Serif", Font.PLAIN, 30));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
		    gl_panel.createParallelGroup(Alignment.TRAILING)
		        .addGroup(gl_panel.createSequentialGroup()
		            .addContainerGap()
		            .addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
		                .addComponent(passwordField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
		                .addComponent(txtUser, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
		                .addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
		            .addGap(18))
		        .addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
		            .addGap(36)
		            .addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
		                .addComponent(lblNewLabel_2)
		                .addGroup(gl_panel.createSequentialGroup()
		                    .addComponent(lblNewLabel)
		                    .addGap(42)
		                    .addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)))
		            .addContainerGap())
		);
		gl_panel.setVerticalGroup(
		    gl_panel.createParallelGroup(Alignment.TRAILING)
		        .addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
		            .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
		                .addGroup(gl_panel.createSequentialGroup()
		                    .addGap(76)
		                    .addComponent(lblNewLabel))
		                .addGroup(gl_panel.createSequentialGroup()
		                    .addContainerGap()
		                    .addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)))
		            .addPreferredGap(ComponentPlacement.UNRELATED)
		            .addComponent(lblNewLabel_2)
		            .addGap(100)
		            .addComponent(txtUser, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
		            .addGap(36)
		            .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
		            .addGap(38)
		            .addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
		            .addContainerGap(155, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
		frame.setVisible(true);
	}

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JTextField getTxtUser() {
        return txtUser;
    }

    public void setTxtUser(JTextField txtUser) {
        this.txtUser = txtUser;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public JButton getBtnLogin() {
        return btnLogin;
    }

    public void setBtnLogin(JButton btnLogin) {
        this.btnLogin = btnLogin;
    }

   
	
	
}
