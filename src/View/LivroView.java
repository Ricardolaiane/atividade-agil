package View;



import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;

public class LivroView {

    private JFrame frmLivro;
    private JPanel panel;
    private JLabel lblTitulo;
    
    public LivroView() {
        frmLivro = new JFrame();
        frmLivro.getContentPane().setBackground(new Color(0, 128, 0));
        frmLivro.setResizable(false);
        frmLivro.setTitle("Livro");
        frmLivro.setBounds(100, 100, 218, 300);
        frmLivro.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        GroupLayout groupLayout = new GroupLayout(frmLivro.getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addContainerGap())
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addContainerGap())
        );
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ricar\\eclipse-workspace\\Atividade-curso\\src\\util\\livro.png"));
        
        lblTitulo = new JLabel("Título");
        lblTitulo.setFont(new Font("DejaVu Serif", Font.PLAIN, 14));
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
            gl_panel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel.createSequentialGroup()
                    .addGap(18)
                    .addComponent(lblNewLabel)
                    .addContainerGap(23, Short.MAX_VALUE))
                .addComponent(lblTitulo, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );
        gl_panel.setVerticalGroup(
            gl_panel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblNewLabel)
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addComponent(lblTitulo)
                    .addContainerGap(85, Short.MAX_VALUE))
        );
        panel.setLayout(gl_panel);
        frmLivro.getContentPane().setLayout(groupLayout);
    }

    public JFrame getFrmLivro() {
        return frmLivro;
    }

    public void setFrmLivro(JFrame frmLivro) {
        this.frmLivro = frmLivro;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public void setLblTitulo(JLabel lblTitulo) {
        this.lblTitulo = lblTitulo;
    }
    
    
}
