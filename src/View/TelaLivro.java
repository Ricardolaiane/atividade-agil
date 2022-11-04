package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Font;

public class TelaLivro extends JInternalFrame {

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TelaLivro frame = new TelaLivro();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public TelaLivro() {
        setBounds(100, 100, 269, 327);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addComponent(panel, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addComponent(panel, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(TelaLivro.class.getResource("/util/livro.png")));
        
        JLabel lblNewLabel_1 = new JLabel("T\u00EDtulo");
        lblNewLabel_1.setFont(new Font("DejaVu Serif", Font.PLAIN, 20));
        
        JButton btnNewButton = new JButton("Sair");
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
            gl_panel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel.createSequentialGroup()
                    .addContainerGap(57, Short.MAX_VALUE)
                    .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                        .addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
                            .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                            .addGap(46))
                        .addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
                            .addComponent(btnNewButton)
                            .addGap(106))))
                .addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
        );
        gl_panel.setVerticalGroup(
            gl_panel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblNewLabel)
                    .addGap(18)
                    .addComponent(lblNewLabel_1)
                    .addPreferredGap(ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                    .addComponent(btnNewButton)
                    .addGap(30))
        );
        panel.setLayout(gl_panel);
        getContentPane().setLayout(groupLayout);

    }
}
