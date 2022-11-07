package View;


import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Font;

public class TrofeuView {

    private JFrame frame;
    private  JPanel panel;
    private JLabel lblGenero;
    private JLabel lblNewLabel_2;

    public TrofeuView() {
        frame = new JFrame();
        frame.setResizable(false);
        frame.setBounds(100, 100, 243, 300);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel, GroupLayout.DEFAULT_SIZE, 1888, Short.MAX_VALUE)
                    .addContainerGap())
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addContainerGap())
        );
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ricar\\eclipse-workspace\\Atividade-curso\\src\\util\\trofeu.png"));
        
        JLabel lblNewLabel_1 = new JLabel("Leitor de");
        lblNewLabel_1.setFont(new Font("DejaVu Serif", Font.BOLD, 16));
        
        lblGenero = new JLabel("New label");
        lblGenero.setVerticalTextPosition(SwingConstants.BOTTOM);
        lblGenero.setFont(new Font("DejaVu Serif", Font.PLAIN, 16));
        lblGenero.setVerticalAlignment(SwingConstants.TOP);
        
        lblNewLabel_2 = new JLabel("!!!!!!!!!!!!!!!!!!");
        lblNewLabel_2.setFont(new Font("DejaVu Serif", Font.PLAIN, 16));
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
            gl_panel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel.createSequentialGroup()
                    .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                            .addGap(65)
                            .addComponent(lblNewLabel))
                        .addGroup(gl_panel.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addComponent(lblGenero, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)))
                    .addContainerGap(36, GroupLayout.PREFERRED_SIZE))
                .addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
                    .addContainerGap(61, Short.MAX_VALUE)
                    .addComponent(lblNewLabel_2)
                    .addGap(48))
        );
        gl_panel.setVerticalGroup(
            gl_panel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblNewLabel)
                    .addGap(18)
                    .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblNewLabel_1)
                        .addComponent(lblGenero))
                    .addGap(18)
                    .addComponent(lblNewLabel_2)
                    .addContainerGap(57, Short.MAX_VALUE))
        );
        panel.setLayout(gl_panel);
        frame.getContentPane().setLayout(groupLayout);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getLblGenero() {
        return lblGenero;
    }

    public void setLblGenero(JLabel lblGenero) {
        this.lblGenero = lblGenero;
    }
    
    

}
